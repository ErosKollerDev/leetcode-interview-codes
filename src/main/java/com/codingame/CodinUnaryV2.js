var MESSAGE = "C";

var res = "";
var pre = -1;

for (var i = 0; i < MESSAGE.length; i++) {

    for (var j = 6; j >= 0; j--) {

        var bit = MESSAGE.charCodeAt(i) >> j & 1;
        if (bit !== pre) {

            if (-1 !== pre) {
                res+= " ";
            }
            res+= 1 == bit ? "0 " : "00 ";
            pre = bit;
        }
        res+= "0";
    }
}
console.log(res);
// print(res);