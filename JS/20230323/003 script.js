const starList = document.querySelectorAll(".fa-solid");


for (let i=0; i<starList.length; i++) {
    const func = function (e) {
        if (starList[i].classList.contains("active")) {
            const activeList = document.querySelectorAll(".active");
            if ( i === activeList.length-1 ) {
                for (let j=0;j<starList.length; j++) {
                    starList[j].classList.remove("active");
                }  
            } else {
                for (let j=i+1;j<starList.length; j++) {
                    starList[j].classList.remove("active");
                }
            }

        } else {
            for (let j=0;j<=i; j++) {
                starList[j].classList.add("active");
            }
        }
    }
    starList[i].addEventListener("click",func)
};


//active클래스를 가진 버튼을 클릭했을때 그것보다 인덱스넘버가 높은 애들이 active가 없다면
//익명함수, js만으로,