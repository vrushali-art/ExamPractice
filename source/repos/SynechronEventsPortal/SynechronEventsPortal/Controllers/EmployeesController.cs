using SynechronEventsPortal.Dal;
using SynechronEventsPortal.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace SynechronEventsPortal.Controllers
{
    public class EmployeesController : Controller
    {
        private readonly EmployeesDal _employeesDal;
        public EmployeesController(EmployeesDal dal)
        {
            _employeesDal = dal;
        }

        // GET: Employees
        public ActionResult Index()
        {
            ViewBag.PageTitle = "Welcome to Synechron Employees List";
            ViewBag.PageSubTitle = "Core Development Team of India";
            return View(_employeesDal.GetAllEmployees());
        }

        public ActionResult Details(int id)
        {
            ViewBag.PageTitle = "Welcome To Synechron Employees List!";
            ViewBag.PageSubTitle = "Core Development Team Of India!";
            return View(_employeesDal.GetEmployeeDetails(id));
        }

        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Create(Employee employee)
        {
            if(ModelState.IsValid)
            {
                employee.Avatar = "~/Images/noimage.jpg";
                int result=_employeesDal.InsertEmployee(employee);
                if(result>0)
                {
                    return RedirectToAction("Index");
                }
                else
                {
                    return View();
                }
            }
            return View();
        }



        public ActionResult Update(int id)
        {
            return View(_employeesDal.GetEmployeeDetails(id));
        }

        [HttpPost]
        public ActionResult Update(Employee employee)
        {
            if (ModelState.IsValid)
            {
                employee.Avatar = "~/Images/noimage.jpg";
                int result = _employeesDal.UpdateEmployee(employee);
                if (result > 0)
                {
                    return RedirectToAction("Index");
                }
                else
                {
                    return View();
                }
            }
            return View();
        }

        public ActionResult Delete(int id)
        {
            return View(_employeesDal.GetEmployeeDetails(id));
        }

        [HttpPost]
        public ActionResult Delete(int id,Employee employee)
        {
           // if (ModelState.IsValid)
           // {
                //employee.Avatar = "~/Images/noimage.jpg";
                int result = _employeesDal.DeleteEmployee(id);
                if (result > 0)
                {
                    return RedirectToAction("Index");
                }  
                return View();
        }
    }
}