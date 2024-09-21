const display = document.getElementById("display");
const clear = document.getElementById("clear");
const back = document.getElementById("backspace");
const total = document.getElementById("total");




function totalDisplay(){ 
    display.value = eval(display.value);
}

function clearDisplay(){ 
    display.value = "";
}

function backSpace(){ 
    display.value = display.value.slice(0,-1);
}




clear.addEventListener("click",()=>{
    clearDisplay();
})

back.addEventListener("click",()=>{
    backSpace();
});

total.addEventListener("click",()=>{
    
    totalDisplay();

});


buttons = [...document.getElementsByTagName("button")]; 

for(let i = 2;i < buttons.length-1;i++){
    
    buttons[i].addEventListener("click", function() {
        display.value += this.textContent;
    });
}


const chars = "0123456789%/*-+.";
document.addEventListener("keydown",(key)=>{
    if (chars.includes(key.key)){
        display.value += key.key;
    }else if(key.key == "Backspace"){
        backSpace();
    }else if(key.key == "Enter"){
        totalDisplay();
    }
})