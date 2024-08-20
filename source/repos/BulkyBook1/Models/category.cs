using System.ComponentModel.DataAnnotations;

namespace BulkyBook1.Models
{
    public class Category
    {
        [Key]
        public int Id { get; set; }
        [Required]
        public  String  Name{ get; set; }
        public int DidplayOrder { get; set; }
        public DateTime CreateDateTime { get; set; } = DateTime.Now;
    }
}
