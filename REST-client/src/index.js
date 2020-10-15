const express = require('express');
const path = require('path');
const app = express();
const favicon = require('serve-favicon'); 

// settings
app.set('port',4000);
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');


// routes
app.get('/home', function(req, res, next) {
    res.sendFile(path.join(__dirname,'views/home.html'));
 });
 app.get('/confirm', function(req, res, next) {
    res.sendFile(path.join(__dirname,'views/confirm.html'));
 });
app.get('/',(req ,res) =>{
    res.sendFile(path.join(__dirname,'views/home.html'));
})

// static files

app.use(express.static(path.join(__dirname, 'public')));
app.use(favicon(path.join(__dirname, 'public', 'images','favicon.ico')))
// listening the Server
app.listen(app.get('port'),() =>{
    console.log('server on http://localhost:'+app.get('port'));
});