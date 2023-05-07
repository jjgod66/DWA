const wrapper = document.querySelector("#wrapper");
const container = document.querySelector("#container");
const btnBox = document.querySelector("#btnBox");
const infoText = document.querySelector("#infoText");
const btnStart = document.querySelector("#btnStart");
const btnRestart = document.querySelector("#btnRestart");
const yourNumberIs = document.querySelector("#yourNumberIs");
const yourLifeIs = document.querySelector("#yourLifeIs");
const select = document.querySelector("select");
let selectValue = select.value;
let counterLife = 3;

//1~9가 들어있는 난수배열 
const numberRandom = Math.floor(Math.random()*9+1);
console.log(numberRandom);

const numberItems = [];
for (let i=1; i<10; i++) {
    numberItems.push(i);
};
for (let i=0; i<numberItems.length; i++) {
    const random = Math.floor(Math.random()*8+1);
    let temp = numberItems[i];
    numberItems.splice(i,1, numberItems[random]);
    numberItems[random] = temp;
};
console.log(numberItems);

// container 안에 itembox 만들기
for (let i=0; i<numberItems.length; i++) {
    const itemBox = document.createElement("div");
    itemBox.classList.add("itemBox");
    itemBox.innerHTML = numberItems[i];
    container.appendChild(itemBox); 
};


for (let i=0; i<numberItems.length; i++) {
    const option = document.createElement("option");
    option.innerHTML = i+1;
    option.setAttribute("value",i+1);
    select.appendChild(option);
}
//h태그에 기본적으로 들어갈 말들
yourNumberIs.innerHTML = "";
yourLifeIs.innerHTML = `Your Life is  ${counterLife}/3`;

//start버튼 이벤트
const start = function (e) {
    selectValue = parseInt(select.value);
    yourNumberIs.innerHTML = `Your Number is ${selectValue}`;
    container.style.display = "flex";
    infoText.style.display = "block";
    select.style.display = "none";
    btnStart.style.display = "none";
};
btnStart.addEventListener("click",start)

//restart버튼 이벤트
const restart = function () {
    location.reload();
};
btnRestart.addEventListener("click", restart);

//itemBox 클릭했을때 이벤트
const itemBox = document.querySelectorAll(".itemBox");
for (let i=0; i<numberItems.length; i++) {
    const clickitemBox = function (e) {

        const gameisOver = function (e) {
            for (let j=0; j<numberItems.length; j++) {
                itemBox[j].classList.add("textcolorWhite");
                itemBox[j].classList.add("cannotClick");
            }
        }

        if (!itemBox[i].classList.contains("cannotClick")) {

            if (parseInt(itemBox[i].innerHTML)===selectValue) {
                itemBox[i].classList.add("goodBox");
                yourNumberIs.innerHTML = "GOOD JOB!";
                yourLifeIs.innerHTML = "";
                gameisOver();
            } else {
                counterLife--;
                itemBox[i].classList.add("wrongBox");
                if (counterLife>0) {
                    itemBox[i].classList.add("textcolorWhite");
                    itemBox[i].classList.add("cannotClick");
                    yourLifeIs.innerHTML = `Wrong! Your Life is ${counterLife}/3`;
                } else {
                    counterLife = 0;
                    gameisOver();
                    yourLifeIs.style.color = "darkred";
                    yourLifeIs.innerHTML = `Failed.. Life is Over`;
                    console.log(counterLife);
                }
            }
        }
    };

    itemBox[i].addEventListener("click",clickitemBox);
    itemBox[i].addEventListener("mouseover", (e) => {
        itemBox[i].style.border = "2px solid darkred";
    })
    itemBox[i].addEventListener("mouseleave",(e) => {
        itemBox[i].style.border = "none";
    })
}