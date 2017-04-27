var mongo = require('mongodb').MongoClient

mongo.connect('mongodb://localhost:27017', function(err, db) {
	if(err) throw err;

	console.log(db.getCollectionNames());

	var coll = db.collection('data');

	coll.find({
		name: 'anto'
	}).toArray(function(err, data) {
		if(err) throw err;
		console.log(data);
		db.close();
	});

  	db.close();
});