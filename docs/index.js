const express = require('express');
const app = express();

app.use(express.static(__dirname));

app.listen(3000, function(err) {
    if(err) {
        console.error(err);
    }
    console.log("Running on port 3000");
});