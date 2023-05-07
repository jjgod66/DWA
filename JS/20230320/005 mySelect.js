const select = document.querySelector("#mySelect");
const p = document.querySelector("#selectedValue");

const callback = function (e) {
    console.log(e);
    console.log(e.target.outerText);
    console.log(e.srcElement.value);
    p.innerHTML = e.target.value + " is selected";    
};
select.addEventListener("change", callback);


