function deleteRows() {
    document.Form1.action = "/delete";
    document.Form1.submit();             // Submit the page
}

function edit() {
    if (document.querySelectorAll('input[type="checkbox"]:checked').length <= 1) {
        document.Form1.action = "/edit";
        document.Form1.submit();             // Submit the page
    } else {
        alert("Please select just one row to be edited");
    }
}

function getTable() {
    microAjax("datagrid", function (msg) {
//msg is the HTML received from server
        document.getElementById('datagrid').innerHTML = msg;
    });
}
