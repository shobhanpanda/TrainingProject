   M S B A M L   `   `   `  ����H  Dfinal_project, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null-clr-namespace:final_projectfinal_project  5          final_project.ApproveUser   5      \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5      R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5      Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5      @d2http://schemas.microsoft.com/expression/blend/2008     5      -localclr-namespace:final_project     5        N� Title$  ApproveUser��5
      ��5      ��  �� Source# Zo� �� Path$ Height���5	   	   �� # Zo�$ Width� � 	Resources 5         placeHolder �� 
TargetType �� BasedOn �� Property �� Value �� 
TargetType	 ��Name
 K� ZIndex �� RelativeSource �� Mode �� UpdateSourceTrigger
 � Tag �� Triggers �� Binding%  System.Windows.Markup.Reference �� Value��%�  &	        7���� 5   
   " ��6$   8   .�5      ��  � �� 5      �� 5      " ��6&   .R�5      � .+�5      �� $	 
textSource��5   "   
������ $
 2��5   "   ��5   &   �� $
 Text� �� *TemplatedParent+$ TwoWay=�$ PropertyChanged=�5   "   �� 5      #��z 6&   #��z��6C   $
 1��6m   .��6~   ��5   "   �� 5   &   " ��6,   .�5   *   ��  � ��
 ���� 6G    5   *   �� 5   .    6:   �� $
 Text�   *
textSource+  6y   .a�5   2   ��  � ��
 �����6O   �� 5    2    � ��$
 Left=�6_   �� 5!   2    � ��$ Center=�6]   5"   /   5$   '   .��5%   1   5&      5'      5(      5*      5+      5,      .��5.      � 
�������$��0,0,0,0q�6   $
��2900��6/    � ColumnDefinitions 5/   
   �� 50      $	��200 �6   �� 51      $��* �6   �� 52      .+�55   
   �� $��0��6   .+�56      o� $	��715��6   $	��200��6!   
�������
����  �$��2q�58      ��59      �� 5:      .R�5;      $�  $� Orientation$ Vertical=�61   5<      .@�5?      m� -   5        $��	_Add ISIN��5?      $
��bold)�6E   $��20(�6W   5C      m� 5E      -   5        $��_View Trades��5E      $
��bold)�6J   $��20(�6\   $��29��6j   $	��Top=�6v   m� 5F      -   5        $��_View Users��5F      $
��bold)�6I   $��20(�6[   m� 5J      -   5        $��_Approve New User��5J      $
��bold)�6O   $��20(�6a   5L      5M      �� 5N   
   -   5         ��Name$ signOut��5N      $��Sign Out��6"   $��22��65   $	��100��6A   $��1��6M   $��405,19,845,687q�6]   6u   &   System.Windows.Controls.DataGrid  5O   
   -   5        $��data1��5O      $��10,201,525,10q�6    $��1��67   6G   �� 5P      -   5        $��approvedUser��5P   	   $��View Approved User��6   $��22��6:   $	��200��6F   $��1��6R   $��5,19,1145,687q�6b   6y   �� 5Q   
   -   5        $��unapprovedUser��5Q      $��View Unpproved User��6'   $��22��6E   $	��200��6Q   $��1��6]   $��205,19,945,687q�6m   6�   �� 5R      -	   5        $��approve��5R      #��[  6"   $ Enter username to approve��6G   $��30��6g   $	��200��6s   $��1��6   $��300,166,850,532q�6�   �� 5S      -
   5        $��approveuser��5S   	   $��Approve��6   $	��200��6.   $��30��6:   $��1��6F   $��505,166,645,532q�6V   6o   5W      5X      