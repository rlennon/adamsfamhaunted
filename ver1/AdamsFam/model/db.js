var mysql = require('mysql');

var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : 'password',
  database : 'adamsfam_db',
  port: 3306 // name of database here
});

connection.connect(function(err){
	if(err) throw err;
	console.log(`Sucessfully connected to MySQL database adamsfam_db`);
});


// Example of exports method and syntax
exports.getShooting = function(req,res){

	connection.query(`SELECT teams.teamcode, teamstats.team, played,
					 (totalGoalsFor / played) AS goalsFor, (totalGoalsAgainst / played) AS goalsAgainst,
					 (totalShotsFor / played) AS shotsFor, (totalShotsAgainst / played) AS shotsAgainst,
					 (totalShotsOnTargetFor / played) AS shotsOnTargetFor, (totalShotsOnTargetAgainst / played) AS shotsOnTargetAgainst
					 FROM teams, teamstats
					 WHERE teams.teamcode = teamstats.teamCode`, function(err, rows, fields) {
		if (err) throw err;

		res.send(JSON.stringify(rows));
	
	  });

}

