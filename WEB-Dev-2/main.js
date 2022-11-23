/*Sticky NavBar*/
window.addEventListener('scroll',function(){
    var header = document.querySelector('header');
    header.classList.toggle('sticky', window.scrollY > 0);
});

/*Filterable Card*/
let list = document.querySelectorAll('.list');
let card = document.querySelectorAll('.card');

for(let i = 0; i<list.length; i++){
    list[i].addEventListener('click',function(){
        for(let j=0; j<list.length; j++){
            list[j].classList.remove('active')
        }
        this.classList.add('active');
        
        let dataFilter = this.getAttribute('data-filter');

        for(let k=0; k<card.length; k++)
        {
            card[k].classList.remove('active');
            card[k].classList.add('hide');

            if(card[k].getAttribute('data-item') == dataFilter || dataFilter == 'all'){
                card[k].classList.remove('hide');
                card[k].classList.add('active');
            }

        }
    })
}
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}
const btnHam = document.querySelector('.ham-btn');
const btnTimes = document.querySelector('.times-btn');
const navBar = document.getElementById('nav-bar');
btnHam.addEventListener('click', function(){
    if(btnHam.className !== ""){
        btnHam.style.display =  "none";
        btnTimes.style.display ="block";
        navBar.classList.add("show-nav");
    }
})
btnTimes.addEventListener('click',function(){
    if(btnHam.className !== ""){
        this.style.display = "none";
        btnHam.style.display = "block";
        navBar.classList.remove("show-nav");
    }

})