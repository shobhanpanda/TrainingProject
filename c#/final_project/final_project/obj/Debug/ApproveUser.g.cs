﻿#pragma checksum "..\..\ApproveUser.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "81DBD2C99AA1EF078B6FF712FD6EC332"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;
using final_project;


namespace final_project {
    
    
    /// <summary>
    /// ApproveUser
    /// </summary>
    public partial class ApproveUser : System.Windows.Controls.Page, System.Windows.Markup.IComponentConnector {
        
        
        #line 78 "..\..\ApproveUser.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button signOut;
        
        #line default
        #line hidden
        
        
        #line 79 "..\..\ApproveUser.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.DataGrid data1;
        
        #line default
        #line hidden
        
        
        #line 80 "..\..\ApproveUser.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button approvedUser;
        
        #line default
        #line hidden
        
        
        #line 81 "..\..\ApproveUser.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button unapprovedUser;
        
        #line default
        #line hidden
        
        
        #line 82 "..\..\ApproveUser.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox approve;
        
        #line default
        #line hidden
        
        
        #line 83 "..\..\ApproveUser.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button approveuser;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/final_project;component/approveuser.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\ApproveUser.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            
            #line 63 "..\..\ApproveUser.xaml"
            ((System.Windows.Controls.MenuItem)(target)).Click += new System.Windows.RoutedEventHandler(this.MenuItem_Click);
            
            #line default
            #line hidden
            return;
            case 2:
            
            #line 69 "..\..\ApproveUser.xaml"
            ((System.Windows.Controls.MenuItem)(target)).Click += new System.Windows.RoutedEventHandler(this.MenuItem_Click_1);
            
            #line default
            #line hidden
            return;
            case 3:
            
            #line 70 "..\..\ApproveUser.xaml"
            ((System.Windows.Controls.MenuItem)(target)).Click += new System.Windows.RoutedEventHandler(this.MenuItem_Click_2);
            
            #line default
            #line hidden
            return;
            case 4:
            
            #line 74 "..\..\ApproveUser.xaml"
            ((System.Windows.Controls.MenuItem)(target)).Click += new System.Windows.RoutedEventHandler(this.MenuItem_Click_3);
            
            #line default
            #line hidden
            return;
            case 5:
            this.signOut = ((System.Windows.Controls.Button)(target));
            
            #line 78 "..\..\ApproveUser.xaml"
            this.signOut.Click += new System.Windows.RoutedEventHandler(this.signOut_Click);
            
            #line default
            #line hidden
            return;
            case 6:
            this.data1 = ((System.Windows.Controls.DataGrid)(target));
            
            #line 79 "..\..\ApproveUser.xaml"
            this.data1.SelectionChanged += new System.Windows.Controls.SelectionChangedEventHandler(this.data1_SelectionChanged);
            
            #line default
            #line hidden
            return;
            case 7:
            this.approvedUser = ((System.Windows.Controls.Button)(target));
            
            #line 80 "..\..\ApproveUser.xaml"
            this.approvedUser.Click += new System.Windows.RoutedEventHandler(this.approvedUser_Click);
            
            #line default
            #line hidden
            return;
            case 8:
            this.unapprovedUser = ((System.Windows.Controls.Button)(target));
            
            #line 81 "..\..\ApproveUser.xaml"
            this.unapprovedUser.Click += new System.Windows.RoutedEventHandler(this.unapprovedUser_Click);
            
            #line default
            #line hidden
            return;
            case 9:
            this.approve = ((System.Windows.Controls.TextBox)(target));
            return;
            case 10:
            this.approveuser = ((System.Windows.Controls.Button)(target));
            
            #line 83 "..\..\ApproveUser.xaml"
            this.approveuser.Click += new System.Windows.RoutedEventHandler(this.approveuser_Click);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

