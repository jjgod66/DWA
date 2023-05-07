const callback = function () {
    let nameValue = document.querySelector("#input").value;
    document.querySelector("#greeting").style.fontSize = "50px";
    document.querySelector("#greeting").innerHTML = nameValue;
    nameValue = "";
    console.log(nameValue);
};

// const callback = function () {
//     let name = document.querySelector("#input");
//     document.querySelector("#greeting").style.fontSize = "50px";
//     document.querySelector("#greeting").innerHTML = name.value;
//     name.value = "";
// };