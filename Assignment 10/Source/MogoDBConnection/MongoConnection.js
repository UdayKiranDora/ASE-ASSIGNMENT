/**
 * Created by mnpw3d on 20/10/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = 'mongodb://UdayKiran:UdayKiran@ds161495.mlab.com:61495/udaykiran';
MongoClient.connect(url, function(err, db) {
  assert.equal(null, err);
  console.log("Connected correctly to server.");
  db.close();
});