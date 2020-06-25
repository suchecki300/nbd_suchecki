printjson(db.people.insertOne({
    sex: "Male",
    first_name: "Emilian",
    last_name: "Suchecki",
    job: "Full Stack Developer",
    email: "s21921@pjwstk.edu.pl",
    location: {
        city: "Karczew",
        address: {
            streetname: "Armii Krajowej",
            streetnumber: "18"
        }
    },
    description: "Field for desc",
    height: "181",
    weight: "90",
    birth_date: "1995-07-14T00:00:00Z",
    nationality: "Poland",
    credit: [{
        type: "XXX",
        number: "123456789",
        currency: "PLN",
        balance: "50000"
    }]
}))