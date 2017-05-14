var exec = require('cordova/exec');
var myMathFunc = function(){};  

myMathFunc.prototype.plus = function(arg0, success, error) {
    exec(success, error, "mapPlugin", "Plus", arg0);
};

myMathFunc.prototype.minus = function(arg0, success, error) {
    exec(success, error, "mapPlugin", "Minus", arg0);
};

var MYMATHFUNC = new myMathFunc();
module.exports = MYMATHFUNC; 