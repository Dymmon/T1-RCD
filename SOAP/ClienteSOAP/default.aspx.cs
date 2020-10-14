using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;

namespace ClienteSOAP
{
    public partial class Inicio : System.Web.UI.Page
    {
        string S = "";
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void BtnVrf_Click(object sender, EventArgs e)
        {
            Ws_R.metodos_wsClient service = new Ws_R.metodos_wsClient();
            lblResult.Text = service.val_digito(num_rut.Text);
        }
        protected void sexo_SelectedIndexChanged(object sender, EventArgs e)
        {
            S = sexo.SelectedItem.Value;
        }
        protected void send_Click(object sender, EventArgs e)
        {
            Ws_R.metodos_wsClient service = new Ws_R.metodos_wsClient();
            string aux = names.Text + " " + AP_PAT.Text + " " + AP_MAT.Text;
            lblSaludo.Text = service.nombre_propio(aux, S);
        }

    }
}