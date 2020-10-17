window.onload = function(){
    function getByIdRequest(){
        var id = localStorage.getItem("ruts");
        axios.get('http://localhost:8080/api/v1/validar/' + id)
        .then(function (response) {
            document.getElementById("rutv").innerHTML=response.data.mensaje;
            console.log(response);
        })
        .catch(function (error) {
        console.log(error);
        alert("Error");
           window.location.href = "home.aspx";
        })
        .then(function () {
        });
}
function postRequest()
{
   axios({
    method: "post",
    url: "http://localhost:8080/api/v1/nombre",
    headers: {
      "Content-Type": "application/json"
    },
        data:{
            nombres: localStorage.getItem("nombres"),
            paterno: localStorage.getItem("appaterno"),
            materno: localStorage.getItem("apmaterno"),
            genero: localStorage.getItem("genero")
        }
    })
     .then(function (response) {
        document.getElementById("saludo").innerHTML=response.data.mensaje;
        console.log(response);
     })
     .catch(function (error) {
      console.log(error);
      alert("Error");
         window.location.href = "home.aspx";
      
     })
     .then(function () {
     });
}
function volver(){
    window.location.href ="home.aspx";
}
postRequest();
getByIdRequest();
document.getElementById("button2").onclick=volver;
}