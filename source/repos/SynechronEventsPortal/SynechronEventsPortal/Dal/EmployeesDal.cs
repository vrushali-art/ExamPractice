using SynechronEventsPortal.Models;
using System.Configuration;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;

namespace SynechronEventsPortal.Dal
{
    public class EmployeesDal
    {
        public List<Employee> GetAllEmployees()
        {
            using (MySqlConnection cn = new MySqlConnection(ConfigurationManager.ConnectionStrings["SynechronEventsConStr"].ConnectionString))
            {
                using (MySqlCommand cmd = new MySqlCommand())
                {
                    cn.Open();
                    cmd.Connection = cn;
                    cmd.CommandType = CommandType.StoredProcedure;
                    cmd.CommandText = "GetAllEmployees";
                    MySqlDataReader dr = cmd.ExecuteReader();
                    List<Employee> employees = new List<Employee>();
                    while (dr.Read())
                    {
                        employees.Add(new Employee()
                        {
                            EmployeeId = Convert.ToInt32(dr["EmployeeId"]),
                            EmployeeName = Convert.ToString(dr["EmployeeName"]),
                            City = Convert.ToString(dr["City"]),
                            Email = Convert.ToString(dr["Email"]),
                            Phone = Convert.ToString(dr["Phone"])

                        });
                    }
                    dr.Close();
                    cn.Close();
                    return employees;
                }
            }
        }

        public Employee GetEmployeeDetails(int employeeId)
        {
            using (MySqlConnection cn = new MySqlConnection(ConfigurationManager.ConnectionStrings["SynechronEventsConStr"].ConnectionString))
            {
                using (MySqlCommand cmd = new MySqlCommand())
                {
                    cn.Open();
                    cmd.Connection = cn;
                    cmd.CommandType = CommandType.StoredProcedure;
                    cmd.CommandText = "GetEmployeeDetails";
                    cmd.Parameters.AddWithValue("p_EmployeeId", employeeId);
                    MySqlDataReader DR = cmd.ExecuteReader();
                    DR.Read();
                    Employee employee = new Employee()
                    {
                        EmployeeId = Convert.ToInt32(DR["EmployeeId"]),
                        EmployeeName = Convert.ToString(DR["EmployeeName"]),
                        Address = Convert.ToString(DR["Address"]),
                        City = Convert.ToString(DR["City"]),
                        Email = Convert.ToString(DR["Email"]),
                        Phone = Convert.ToString(DR["Phone"]),
                        Zipcode = Convert.ToString(DR["Zipcode"]),
                        Skillsets = Convert.ToString(DR["Skillsets"]),
                        Avatar = Convert.ToString(DR["Avatar"]),
                        Country = Convert.ToString(DR["Country"])
                    };

                    DR.Close();
                    cn.Close();
                    return employee;
                }
            }
        }

        public int InsertEmployee(Employee employee)
        {
            using (MySqlConnection cn = new MySqlConnection(ConfigurationManager.ConnectionStrings["SynechronEventsConStr"].ConnectionString))
            {
                using (MySqlCommand cmd = new MySqlCommand())
                {
                    cn.Open();
                    cmd.Connection = cn;
                    cmd.CommandType = CommandType.StoredProcedure;
                    cmd.CommandText = "InsertEmployee";
                    cmd.Parameters.AddWithValue("p_EmployeeName", employee.EmployeeName);
                    cmd.Parameters.AddWithValue("p_Address", employee.Address);
                    cmd.Parameters.AddWithValue("p_City", employee.City);
                    cmd.Parameters.AddWithValue("p_Country", employee.Country);
                    cmd.Parameters.AddWithValue("p_Phone", employee.Phone);
                    cmd.Parameters.AddWithValue("p_Email", employee.Email);
                    cmd.Parameters.AddWithValue("p_Skillsets", employee.Skillsets);
                    cmd.Parameters.AddWithValue("p_Avatar", employee.Avatar);
                    cmd.Parameters.AddWithValue("p_Zipcode", employee.Zipcode);
                    int result = cmd.ExecuteNonQuery();
                    cn.Close();
                    return result;
                }

            }
        }

        public int UpdateEmployee(Employee employee)
        {
            using (MySqlConnection cn = new MySqlConnection(ConfigurationManager.ConnectionStrings["SynechronEventsConStr"].ConnectionString))
            {
                using (MySqlCommand cmd = new MySqlCommand())
                {
                    cn.Open();
                    cmd.Connection = cn;
                    cmd.CommandType = CommandType.StoredProcedure;
                    cmd.CommandText = "UpdateEmployee";
                    cmd.Parameters.AddWithValue("p_EmployeeId", employee.EmployeeId);
                    cmd.Parameters.AddWithValue("p_EmployeeName", employee.EmployeeName);
                    cmd.Parameters.AddWithValue("p_Address", employee.Address);
                    cmd.Parameters.AddWithValue("p_City", employee.City);
                    cmd.Parameters.AddWithValue("p_Country", employee.Country);
                    cmd.Parameters.AddWithValue("p_Phone", employee.Phone);
                    cmd.Parameters.AddWithValue("p_Email", employee.Email);
                    cmd.Parameters.AddWithValue("p_Skillsets", employee.Skillsets);
                    cmd.Parameters.AddWithValue("p_Avatar", employee.Avatar);
                    cmd.Parameters.AddWithValue("p_Zipcode", employee.Zipcode);
                    int result = cmd.ExecuteNonQuery();
                    cn.Close();
                    return result;
                }

            }
        }

        public int DeleteEmployee(int id)
        {
            using (MySqlConnection cn = new MySqlConnection(ConfigurationManager.ConnectionStrings["SynechronEventsConStr"].ConnectionString))
            {
                using (MySqlCommand cmd = new MySqlCommand())
                {
                    cn.Open();
                    cmd.Connection = cn;
                    cmd.CommandType = CommandType.StoredProcedure;
                    cmd.CommandText = "DeleteEmployee";
                    cmd.Parameters.AddWithValue("p_EmployeeId", id);
                    int result = cmd.ExecuteNonQuery();
                    cn.Close();
                    return result;
                }

            }
        }
    }

}