const myDiv = document.querySelector("#myDiv");

const btn1 = document.querySelector("#btn1");
const classAdd = function (e) {
        myDiv.classList.add("myStyle");
};
btn1.addEventListener("click", classAdd);


const btn2 = document.querySelector("#btn2");
const classRemove = function (e) {
        myDiv.classList.remove("myStyle");
};
btn2.addEventListener("click", classRemove);


const btn3 = document.querySelector("#btn3");
const classChange = function (e) {
        if (myDiv.classList = []) {
                console.log("aaa");
                myDiv.classList.add("myStyle");
        };



        // myDiv.classList.toggle("myStyle");
};
btn3.addEventListener("click", classChange);

