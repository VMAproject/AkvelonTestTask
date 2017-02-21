var ok = "resources/ok.png";
var bad = "resources/bad.png";
function update() {
    document.Form1.action = "/update";
}
function add() {
    document.Form1.action = "/add";
}

function setImg(id, isOk) {
    if (isOk) {
        document.getElementById(id).src = ok;
        return true;
    } else {
        var elementById = document.getElementById(id);
        elementById.src = bad;
        return false;
    }
}

function checkName(name) {
    var re = /^[a-zA-Z~]{1,30}$/;//todo remove '~' after testing
    return re.test(name);
}

function checkFirstName() {
    var s = document.getElementById("firstname").value;
    var test = checkName(s);
    return setImg("firstnameImg", test);
}

function checkLastName() {
    var s = document.getElementById("lastname").value;
    var test = checkName(s);
    return setImg("lastnameImg", test);
}

function checkTelephone() {
    var re = /^\d{6,15}$/;
    var s = document.getElementById("telephone").value;
    var test = re.test(s);
    return setImg("telephoneImg", test);
}

function checkEmail() {
    var re = /^[\w\+]+(\.\w-]+)*@[A-Za-z0-9-]+(\.[A-Za-z0-9]+)*(\.[A-Za-z]{2,})$/;
    var s = document.getElementById("email").value;
    var test = re.test(s);
    return setImg("emailImg", test);
}

function checkFormOk() {
    if (checkFirstName() && checkLastName() && checkEmail() && checkTelephone()) {
        return true;
    }
    document.getElementById('message').innerHTML = "Please, fill all fields as required";
    return false;
}