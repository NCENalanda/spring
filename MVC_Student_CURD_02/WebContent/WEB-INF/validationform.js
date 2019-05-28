function validateForm() {
    var x = document.frm.name.value;
    if (x == "") {
        alert("Name must be filled out");
        return false;
    }
} 