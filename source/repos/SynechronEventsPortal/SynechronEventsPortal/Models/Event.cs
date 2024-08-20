using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SynechronEventsPortal.Models
{
    public class Event
    {
        public int EventId { get; set; }
        public int EventCode { get; set; }
        public String EventName { get; set; }
        public String Description { get; set; }
        public int StartDate { get; set; }
        public int EndDate { get; set; }
        public int Fees { get; set; }
        public int TotalSeatsFilled { get; set; }
        public int Logo { get; set; }
    }
}