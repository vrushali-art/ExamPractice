using System;
using System.ComponentModel.DataAnnotations;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SynechronEventsPortal.Models
{
    public class Employee
    {
        public int EmployeeId { get; set; }

        [Required(ErrorMessage="Employee Name is required")]
        public string EmployeeName { get; set; }

        [Required(ErrorMessage = "Employee Name is required")]
        public string Address { get; set; }
        public string City { get; set; }
        public string Country { get; set; }

        [Required(ErrorMessage = "Phone is required")]
        public string Phone { get; set; }

        [Required(ErrorMessage = "Email is required")]
        public string Email { get; set; }

        public string Skillsets { get; set; }
        public string Avatar { get; set; }
        public string Zipcode { get; set; }
    }
}