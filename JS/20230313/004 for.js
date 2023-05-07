const pTag = document.querySelector("p");
const pTagList = document.querySelectorAll("p");
// const pTagList = document.getElementsByTagName("p");
console.log(pTagList);

// For Loop 순환구조

// 1) 가장 전통적인 방법
// for (let i=0; i<pTagList.length; i++) {
//     pTagList[i].style.backgroundColor = "yellow"
// }

// 2) ForEach 자바스크립트에서 가장 많이 사용하는 방법
// pTagList.forEach(function(p,i) {
//     p.style.backgroundColor= "yellow"
// });

// 3) For..of 그냥 알아두자
for (const p of pTagList) {
    p.style.backgroundColor= "yellow";
}

// 4) For..in 나중에 알아보자..

// pTagList[0].style.color = "red";
// pTagList[1].style.background = "yellow";
// pTagList[2].style.fontSize = "24px";
// pTagList[3].innerHTML = "aaaaa";
