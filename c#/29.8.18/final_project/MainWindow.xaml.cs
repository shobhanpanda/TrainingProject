using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace final_project
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }


        private void btnOk_Click(object sender, RoutedEventArgs e)
        {
            string pass = passwordBox.Password.ToString();
            string uname = this.username.Text;
            if (uname == "admin" && pass == "password")
            {
                MainFrame.Navigate(new Uri("login.xaml", UriKind.Relative));
                //login obj = new login();
                //this.Content = obj;
                ViewTrades vt = new ViewTrades();

            }
            else
            {
                MessageBox.Show("Wrong userame or password");
            }
        }
    }
}
