const MongoClient = require('mongodb').MongoClient;
const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net"

//create data base const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net/databasename"

/*MongoClient.connect(url, { useNewUrlParser: true },function(err,db){
    if(err) throw (err);
      console.log("created")  
    db.close();
})*/

//create collection 

/*MongoClient.connect(url,{ useNewUrlParser: true },function(err,db){
    if(err) throw err;
    console.log("dataBase Connected")
    var database = db.db("mydatabasev1");
    database.createCollection("Student",function(err,res){
        if(err) throw err ;
        console.log("collection Created");
        console.log(res);
        db.close();
    })

})*/

// add single Documents 

/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    database.collection("Student").insertOne({"name":"MANISH","ADDRESS":"THANE","ROLLNO":79},function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    })
})*/

//add Multiple documents

/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    var myobj = [
        { name: 'John', address: 'Highway 71' , ROLLNO:1},
        { name: 'Peter', address: 'Lowstreet 4', ROLLNO:2},
        { name: 'Amy', address: 'Apple st 652', ROLLNO:3},
        { name: 'Hannah', address: 'Mountain 21',ROLLNO:4},
        { name: 'Michael', address: 'Valley 345',ROLLNO:5},
        { name: 'Sandy', address: 'Ocean blvd 2',ROLLNO:6},
        { name: 'Betty', address: 'Green Grass 1',ROLLNO:7},
        { name: 'Richard', address: 'Sky st 331',ROLLNO:8},
        { name: 'Susan', address: 'One way 98',ROLLNO:9},
        { name: 'Vicky', address: 'Yellow Garden 2',ROLLNO:10},
        { name: 'Ben', address: 'Park Lane 38',ROLLNO:11},
        { name: 'William', address: 'Central st 954',ROLLNO:12},
        { name: 'Chuck', address: 'Main Road 989',ROLLNO:13},
        { name: 'Viola', address: 'Sideway 1633',ROLLNO:14}
      ];
    database.collection("Student").insert(myobj,function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    })
})*/

// Query for Selection

/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    var database = db.db("mydatabasev1");
    database.collection("Student").findOne({},function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    })
})*/

// sorting 

/*==MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    var sortbyname = {name:1}
    database.collection("Student").find({}).sort(sortbyname).toArray(function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    })

})*/

/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    database.collection("Student").find({},{ projection: { _id: 0, name: 1, address: 1,ROLLNO:1 } }).toArray(function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    })

})*/
/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1");
  var query =  { address: "Park Lane 38" };
  database.collection("Student").find(query).toArray(function(err,res){
      if(err) throw err;
      console.log(res);
      db.close();
  })
})*/
/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1");
    var query = { address: /^S/ };
    database.collection("Student").find(query).toArray(function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    }) 
})*/
// DELETE SPECIFIC DATA
/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err)  throw err;
    var database = db.db("mydatabasev1")
    var query = {name:"MANISH"}
    database.collection("Student").deleteOne(query,function(err,obj){
        if(err) throw err;
        console.log(obj)
        db.close();
    })
})*/
/*
MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    var query ={ address: "Canyon 123" };
    var newvalues = { $set: {name: "Rick", address: "Canyon 123" } };
    database.collection("Student").updateOne(query,newvalues,function(err,res){
        if(err) throw err;
        console.log(res.result.nModified);
        db.close();
    })
})*/

/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database =db.db("mydatabasev1")
    database.collection("Student").insertOne({name:"MANISH" , address: "THANE", ROLLNO:79 },function(err,res){
        if(err) throw err;
        console.log(res)
        db.close();
    })
})*/

/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    var query = {name:"MANISH"};
    database.collection("Student").find(query).toArray(function(err,res){
        if(err) throw err;
        console.log(res)
        db.close();
    })
    
    
})*/
/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    var query = {name:"MANISH"}
    var newValue ={ $set: {address:"MUMBAI"}}
    database.collection("Student").updateOne(query,newValue,function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    })
})*/
/*
MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    database.collection("Student").createIndex({ROLLNO : 1},function(err,res){
        if(err) throw err;
        console.log(res)
        db.close();

    })
})*/
/*
MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    var query = [{$match:{name:"MANISH"}}]
    database.collection("Student").aggregate(query) .toArray(function(err,res){
        if(err) throw err;
        console.log(res)
        db.close();
    })
})*/
/*
MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("mydatabasev1")
    var query =  {ROLLNO:{$lt:5}}
    database.collection("Student").find(query) .toArray(function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    })
})*/
/*
MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("companies")
    var query =[{$group:{_id:"$category_code", socailCategory:{$eq:"social"}}}]
    var query2= {maxRollNo:{$max:"$ROLLNO"}}
    database.collection("Student").aggregate(query) .toArray(function(err,res){
        if(err) throw err;
        console.log(res);
        db.close();
    })
})*/

