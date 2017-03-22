/**
 * Created by syf on 2017/3/22
 */

window.onload = function () {
    startTime();
};

var timeData = {
    timeMsg: ''
};

var timeVue = new Vue({
    el: '#time',
    data: timeData
});

function startTime() {
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();
    var checkTime = function (i) {
        if (i < 10) {
            i = "0" + i;
        }
        return i;
    };
    h = checkTime(h);
    m = checkTime(m);
    s = checkTime(s);
    timeData.timeMsg = h + ":" + m + ":" + s;
    setTimeout(function () {
        startTime()
    }, 500);
}