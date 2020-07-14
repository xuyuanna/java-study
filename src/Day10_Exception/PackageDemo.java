

/*
包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰
不同包中的子类还可以直接访问父类中被protected权限修饰的成员

包与包之间可以使用的权限只有 public 和protected

             public      protected     default     private

同一个类中       √           √           √           √

同一个包中       √           √           √           ×

子类            √           √           ×           ×

不同包中        √           ×           ×           ×
 */

package Day10_Exception;

/*
使用关键字 import.  ：简化类名的书写
import 导入的是包中的类
*：导入包中的所有类
不建议用*
*/

public class PackageDemo {
}
