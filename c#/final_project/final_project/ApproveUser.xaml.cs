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
using System.Data.Sql;
using System.Data.SqlClient;
using System.Data;

namespace final_project
{
    /// <summary>
    /// Interaction logic for ViewUsers.xaml
    /// </summary>
    public partial class ApproveUser : Page
    {
        public ApproveUser()
        {
            InitializeComponent();
        }

        private void MenuItem_Click(object sender, System.Windows.RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("login.xaml", UriKind.Relative));
        }

        private void MenuItem_Click_1(object sender, System.Windows.RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("ViewTrades.xaml", UriKind.Relative));
        }

        private void MenuItem_Click_2(object sender, System.Windows.RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("ViewUsers.xaml", UriKind.Relative));

        }

        private void MenuItem_Click_3(object sender, System.Windows.RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("ApproveUser.xaml", UriKind.Relative));
        }

        private void signOut_Click(object sender, System.Windows.RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("SignOut.xaml", UriKind.Relative));
        }

        private void approvedUser_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                using (SqlConnection connection = new SqlConnection())
                {
                    connection.ConnectionString = @"Data Source= Grad61; Integrated Security= SSPI;" +
                        "Initial Catalog=pranav ";
                    connection.Open();
                    string sql = "select * From SecDet where freq=0";
                    using (SqlCommand myCommand = new SqlCommand(sql, connection))
                    {
                        myCommand.CommandType = CommandType.Text;
                        SqlDataAdapter adapter = new SqlDataAdapter();
                        adapter.SelectCommand = myCommand;
                        DataSet dataset = new DataSet();
                        adapter.Fill(dataset);
                        DataTable table = dataset.Tables[0];
                        data1.ItemsSource = new DataView(table);





                    }
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }

        }

        private void unapprovedUser_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                using (SqlConnection connection = new SqlConnection())
                {
                    connection.ConnectionString = @"Data Source= Grad61; Integrated Security= SSPI;" +
                        "Initial Catalog=pranav ";
                    connection.Open();
                    string sql = "select * From SecDet where freq=1 ";
                    using (SqlCommand myCommand = new SqlCommand(sql, connection))
                    {
                        myCommand.CommandType = CommandType.Text;
                        SqlDataAdapter adapter = new SqlDataAdapter();
                        adapter.SelectCommand = myCommand;
                        DataSet dataset = new DataSet();
                        adapter.Fill(dataset);
                        DataTable table = dataset.Tables[0];
                        data1.ItemsSource = new DataView(table);





                    }
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }

        }

        private void data1_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }

        private void approveuser_Click(object sender, RoutedEventArgs e)
        {
            
        }
    }
}

