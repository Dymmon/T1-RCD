<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="default.aspx.cs" Inherits="ClienteSOAP.Inicio" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" runat="server"/>
    <title>Servicio SOAP</title>
    <meta charset="utf-8" runat="server"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" runat="server"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
</head>
<body>
    <form id="form1" runat="server">
    <div class="container" runat="server">
        <h1>Servicio SOAP</h1><br /><br />
        <asp:Label ID="lblRut" Text="RUT: " runat="server" />
        <asp:TextBox ID="num_rut" runat="server"/><br />
        <br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<asp:Button id="BtnVrf" Text="Verificar" class="btn btn-success" runat="server" OnClick="BtnVrf_Click"/><br />
        <br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<asp:Label ID="lblResult" Text="---" runat="server" />
        <hr /><br />
        <asp:Label ID="lblnames" Text="Nombres: " runat="server" />
        <asp:TextBox ID="names" runat="server" /><br />
        <asp:Label ID="lblAPP" Text="Apellido paterno : " runat="server" />
        <asp:TextBox ID="AP_PAT" runat="server" /><br />
        <asp:Label ID="lblAPM" Text="Apellido materno: " runat="server" />
        <asp:TextBox ID="AP_MAT" runat="server" /><br /><br />
        <asp:RadioButtonList ID="sexo" class="btn btn-primary" runat="server" OnSelectedIndexChanged="sexo_SelectedIndexChanged">
            <asp:ListItem Text="Masculino" Value="M"></asp:ListItem>
            <asp:ListItem Text="Femenino" Value="F"></asp:ListItem>
        </asp:RadioButtonList><br /><br />
        <asp:Button ID="send" Text="Enviar" class="btn btn-success" runat="server" OnClick="send_Click" /><br />
        <asp:Label ID="lblSaludo" Text=" " runat="server"/>
    </div>
    </form>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>
