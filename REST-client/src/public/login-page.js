var numbers=/^[0-9]+$/;
var run;
var genero;
var con=0;
window.onload = function(){
  function dato(){
  if(document.getElementById('genderm').checked){
        genero="M";}
  else{
      if(document.getElementById('genderf').checked){
          genero="F";}   
    }  
    
    for(var i=document.getElementById("rut").value.length-1;i>=0;i--){
        if(i==document.getElementById("rut").value.length-1){
            if(document.getElementById("rut").value[i]==0)
                run="-k";
            else{
                run="-"+document.getElementById("rut").value[i];
            }    
        }
        else{
            if(con==2){
            run="."+document.getElementById("rut").value[i]+run;
            con=0;
            }
            else{
            run=document.getElementById("rut").value[i]+run;
            con++;
            }
        }    
    }   
    localStorage.setItem("nombres",document.getElementById("fname").value);
    localStorage.setItem("appaterno",document.getElementById("lname").value);
    localStorage.setItem("apmaterno",document.getElementById("lnamem").value);
    localStorage.setItem("genero",genero);
    localStorage.setItem("ruts",run);
    location.href="confirm";
}
function nf(){
    if(document.getElementById("fname").value==""){
        alert("ingrese su nombre");
    }
    else{
        if(document.getElementById("lname").value==""){
                    alert("ingrese un appellido paterno");
        }    
        else{
            if(document.getElementById("lnamem").value==""){
                alert("ingrese un appellido materno");
            }    
            else{
                if(document.getElementById("rut").value==""|| document.getElementById("rut").value.match(numbers)==null || document.getElementById("rut").value.length<8||document.getElementById("rut").value.length>9){
                        alert("ingrese un rut valido");
                    }    
                else{
                    if(document.getElementById('genderm').checked || document.getElementById('genderf').checked ){
                        dato();
                    }
                    else{
                            alert("seleccione su genero");
                    }
                }

            }

        }

    }

}

    document.getElementById("button").onclick=nf;  

}     

