id = document.getElementById('label-id').textContent;
input_button = document.getElementById('form-input');
input_button.addEventListener ('click', () => {
    //e.preventDefault();
    validateData();
});

function sendData(contact){

    fetch(`/contact/${id}`, {
        method: 'PUT',
        body: JSON.stringify(contact),
        headers: {
            'Content-type': 'application/json',
        }
    }).then(res => res.json())
    .then(data => console.log(data));

    alert("Contacto editado exitosamente");
    window.location.href = `/contacts/${id}`;
}

function validateData(){
    let name = document.getElementById('input-name');
    let number = document.getElementById('input-number');
    let email = document.getElementById('input-email');
    let date = document.getElementById('input-date');
    
    if(isNotEmpty(name.value) && isNotEmpty(email.value) &&  isNotEmpty(number.value)){
        if(validateNumber(number.value) && validateEmail(email.value)){
            
            let contact = {
                name: name.value,
                phone_number: number.value,
                email: email.value,
                birth_date: date.value
            }

            sendData(contact);
        }
    }
}

function validateEmail (email){

	re=/^([\da-z_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/
	if(!re.exec(email.toLowerCase())){
		alert('email no valido');
        return false;
	}else{
        return true;
    }
}

function validateNumber(number){
    if(isNaN(number)){
        alert('Ingrese un numero valido');
        return false;
    }else{
        return true;
    }
}

function isNotEmpty(value){
    value = value.replace("&nbsp;", "");
    value = value == undefined ? "" : value;
    if (!value || 0 === value.trim().length) {
        alert('Asegúrese de llenar todos los campos');
        return false;
    }else{
        return true;
    }
}