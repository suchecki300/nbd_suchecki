import riak

client = riak.RiakClient()
bucket = client.bucket('controller')

def main():

    print("-Adding to database: ")
    addController("Pioneer", "XZ")
    controller1 = bucket.get('controller')
    print(controller1.data)

    print("-Editing document in database")
    controller1.data['model'] = 'RZ'
    controller1.store()
    controller2 = bucket.get('controller')
    print(controller2.data)

    print("-Removing document from database")
    controller1.delete()
    print(controller1.data)
    controller1.store()

    def addController(company, model):
        controller = bucket.new('controller', data={
            'company': company,
            'model': model
        })


if __name__ == "__main__":
    main()