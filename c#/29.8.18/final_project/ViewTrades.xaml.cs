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
    /// Interaction logic for ViewTrades.xaml
    /// </summary>
    public partial class ViewTrades : Page
    {
        public ViewTrades()
        {
            InitializeComponent();
            try
            {
                using (SqlConnection connection = new SqlConnection())
                {
                    connection.ConnectionString = @"Data Source= Grad61; Integrated Security= SSPI;" +
                        "Initial Catalog=ReferenceDatabase ";
                    connection.Open();
                    string sql = "select * From Trade ";
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

        private void MenuItem_Click(object sender, RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("login.xaml", UriKind.Relative));
        }

        private void MenuItem_Click_1(object sender, RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("ViewTrades.xaml", UriKind.Relative));
        }

        private void MenuItem_Click_2(object sender, RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("ViewUsers.xaml", UriKind.Relative));
            
        }

        private void MenuItem_Click_3(object sender, RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("ApproveUser.xaml", UriKind.Relative));
        }

        private void MenuItem_Click_4(object sender, RoutedEventArgs e)
        {

            this.NavigationService.Navigate(new Uri("SignOut.xaml", UriKind.Relative));

        }
        private void viewLastTrades_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                using (SqlConnection connection = new SqlConnection())
                {
                    connection.ConnectionString = @"Data Source= Grad61; Integrated Security= SSPI;" +
                        "Initial Catalog=ReferenceDatabase ";
                    connection.Open();
                    string sql = "SELECT TOP 5* FROM Trade ORDER BY TradeID DESC ";
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

private void viewTrades_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                using (SqlConnection connection = new SqlConnection())
                {
                    connection.ConnectionString = @"Data Source= Grad61; Integrated Security= SSPI;" +
                        "Initial Catalog=ReferenceDatabase ";
                    connection.Open();
                    string sql = "select * From Trade ";
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

        private void signOut_Click(object sender, RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("SignOut.xaml", UriKind.Relative));
        }

        private void searchTrade_Click(object sender, RoutedEventArgs e)
        {


            try
            {
                using (SqlConnection connection = new SqlConnection())
                {

                    int user2;

                    if (int.TryParse(searchTrades.Text, out user2))
                    {
                        //parsing successful 
                    }
                    else
                    {

                        //parsing failed. 
                    }


                    connection.ConnectionString = @"Data Source= Grad61; Integrated Security= SSPI;" +
                        "Initial Catalog=ReferenceDatabase";
                    connection.Open();
                    string sql = "select *  From Trade where TradeID =" + $"'{ user2}'";
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
            catch (Exception)
            {
                MessageBox.Show("Enter Valid User Name");
            }
        }
    }
}
