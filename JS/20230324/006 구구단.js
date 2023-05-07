const h1 = document.createElement("h1");
document.body.appendChild(h1);
h1.innerHTML = "구구단";

for (let i=1;i<=9;i++) {
    const table = document.createElement("table");
    const tr = document.createElement("tr");
    const th = document.createElement("th");
    th.innerHTML = i+"단";
    tr.appendChild(th);
    table.appendChild(tr);
    for (let j=1;j<=9;j++) {
        const tr2 = document.createElement("tr");
        const td = document.createElement("td");
        td.innerHTML = i + " X " + j + " = " + i*j;
        tr2.appendChild(td);
        table.appendChild(tr2);
    }
    document.body.appendChild(table);
}