var express = require("express");
var _ = require('underscore');
var bodyParser = require("body-parser");
var cors = require("cors");
var request = require('request');
var db = require('./model/db');


var app = express();
app.use(cors());

app.use(express.static('public'));

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}));

// routes
// This is skeleton function/route
app.get("/NameOfPage", function(req,res){
  //db.getSummary(req,res);
  db.nameOfMethod(req,res); // use this to call methods from the db file located in model folder
})


// use to ignore favicon error
app.use(ignoreFavicon);

// favicon error prevention function
// I have been having this error without knowing why
// So I found this solution online
// middleware function
function ignoreFavicon(req, res, next) {
  if (req.originalUrl.includes('favicon.ico')) {
    res.status(204).end()
  }
  next();
}