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

namespace final_project
{
    /// <summary>
    /// Interaction logic for login.xaml
    /// </summary>
    public partial class login : Page
    {
        public login()
        {
            InitializeComponent();
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
       
        static DateTime? isdate,matdate;

        private void DatePicker_SelectedDateChanged(object sender,
            SelectionChangedEventArgs e)
        {
            // ... Get DatePicker reference.
            var picker = sender as DatePicker;

            // ... Get nullable DateTime from SelectedDate.
             isdate = (DateTime)picker.SelectedDate;
            if (isdate == null)
            {
                // ... A null object.
                this.Title = "No date";
            }
            else
            {
                // ... No need to display the time.
                this.Title = isdate.Value.ToShortDateString();
            }
            
        }



        private void DatePicker_SelectedDateChanged2(object sender,
            SelectionChangedEventArgs e)
        {
            // ... Get DatePicker reference.
            var picker2 = sender as DatePicker;

            // ... Get nullable DateTime from SelectedDate.
             matdate = picker2.SelectedDate;
            if (matdate == null)
            {
                // ... A null object.
                this.Title = "No date";
            }
            else
            {
                // ... No need to display the time.
                this.Title = matdate.Value.ToShortDateString();
            }
            
    }

        private void signOut_Click(object sender, RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("SignOut.xaml", UriKind.Relative));
        }

        private void reset_Click(object sender, RoutedEventArgs e)
        {
            this.NavigationService.Navigate(new Uri("login.xaml", UriKind.Relative));
        }


        private void submit_Click(object sender, RoutedEventArgs e)
        {
            
            
            string cocode = this.CoCode.Text;
            
            string iscode = this.IsCode.Text;
            
            string istype = this.IsType.Text;
            
            
            
            string seno = this.SeNo.Text;
             


            string sin1 = this.sin.Text;
           
            
            int sectype;
            

            if (int.TryParse(SecType.Text, out sectype))
            {
                //parsing successful 
            }
            else
            {
                
                //parsing failed. 
            }
            string sectype1 = sectype.ToString();

            string isin = cocode + istype + iscode + sectype + seno;
            float courate;

            if (float.TryParse(CouRate.Text, out courate))
            {
                //parsing successful 
            }
            else
            {

                //parsing failed. 
            }

            int freq;

            if (int.TryParse(Freq.Text, out freq))
            {
                //parsing successful 
            }
            else
            {

                //parsing failed. 
            }

          
            int daycoucon;

            if (int.TryParse(DayCouCon.Text, out daycoucon))
            {
                //parsing successful 
            }
            else
            {

                //parsing failed. 
            }

            


            SqlConnection conn = null;
            try
            {
                conn = new SqlConnection(@"Data source=GRAD61; INTEGRATED SECURITY=SSPI; INITIAL CATALOG=ReferenceDatabase");
                conn.Open();
                string sql = "INSERT INTO Bond " + "(ISIN,CoCode,IsCode,SecType,IsType,Securities_IssuerName,SeNo,CouRate,Freq,IsDate,MatDate,DayCouCon) values" +
                    "(@isin,@cocode,@iscode,@sectype,@istype,@sin1,@seno,@courate,@freq,@isdate,@matdate,@daycoucon)";
                using (SqlCommand command = new SqlCommand(sql, conn))
                {
                    SqlParameter parameter = new SqlParameter
                    {
                        ParameterName = "@isin",
                        Value = isin,
                        SqlDbType = System.Data.SqlDbType.VarChar,
                        Size = 12


                    };
                    command.Parameters.Add(parameter);
                    SqlParameter parameter1 = new SqlParameter
                    {
                        ParameterName = "@cocode",
                        Value = cocode,
                        SqlDbType = System.Data.SqlDbType.VarChar,
                        Size = 10


                    };
                    command.Parameters.Add(parameter1);

                    SqlParameter parameter2 = new SqlParameter
                    {
                        ParameterName = "@iscode",
                        Value = iscode,
                        SqlDbType = System.Data.SqlDbType.VarChar,
                        Size = 10


                    };
                    command.Parameters.Add(parameter2);
                    SqlParameter parameter3 = new SqlParameter
                    {
                        ParameterName = "@sectype",
                        Value = sectype,
                        SqlDbType = System.Data.SqlDbType.VarChar,
                        Size = 10


                    };
                    command.Parameters.Add(parameter3);
                    SqlParameter parameter4 = new SqlParameter
                    {
                        ParameterName = "@istype",
                        Value = istype,
                        SqlDbType = System.Data.SqlDbType.VarChar,
                        Size = 10


                    };
                    command.Parameters.Add(parameter4);

                    SqlParameter parameter5 = new SqlParameter
                    {
                        ParameterName = "@sin1",
                        Value = sin1,
                        SqlDbType = System.Data.SqlDbType.VarChar,
                        Size = 50


                    };
                    command.Parameters.Add(parameter5);
                    SqlParameter parameter6 = new SqlParameter
                    {
                        ParameterName = "@seno",
                        Value = seno,
                        SqlDbType = System.Data.SqlDbType.Int,
                        Size = 10


                    };
                    command.Parameters.Add(parameter6);
                    SqlParameter parameter7 = new SqlParameter
                    {
                        ParameterName = "@courate",
                        Value = courate,
                        SqlDbType = System.Data.SqlDbType.Float,
                        Size = 10


                    };
                    command.Parameters.Add(parameter7);
                    SqlParameter parameter8= new SqlParameter
                    {
                        ParameterName = "@freq",
                        Value = freq,
                        SqlDbType = System.Data.SqlDbType.Int,
                        Size = 10


                    };
                    command.Parameters.Add(parameter8);

                    


                    SqlParameter parameter11 = new SqlParameter
                    {
                        ParameterName = "@daycoucon",
                        Value = daycoucon,
                        SqlDbType = System.Data.SqlDbType.Int,
                        Size = 10


                    };
                    command.Parameters.Add(parameter11);

                    
                  

                    SqlParameter parameter13 = new SqlParameter
                    {
                        ParameterName = "@matdate",
                        Value = matdate,
                        SqlDbType = System.Data.SqlDbType.DateTime,
                        Size = 12


                    };
                    command.Parameters.Add(parameter13);

                    SqlParameter parameter14 = new SqlParameter
                    {
                       
                        ParameterName = "@isdate",
                        Value = isdate,
                        SqlDbType = System.Data.SqlDbType.DateTime,
                        Size = 12


                    };
                    command.Parameters.Add(parameter14);


                    command.ExecuteNonQuery();

                }
                MessageBox.Show("Value Entered successfully");
            }

            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }


        }
    }
}
