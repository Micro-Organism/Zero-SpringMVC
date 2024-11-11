package com.zero.mvc.maven.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloController {

    //完整请求地址：localhost:8080/hello/world.do
    @RequestMapping("/world.do")
    public void world() {
        System.out.println("Hello World");
    }
//
//    //完整请求地址：localhost:8080/hello/spring.do
//    @RequestMapping("/spring.do")
//    public void spring() {
//        System.out.println("Hello Spring");
//    }
//
//    @RequestMapping(value = "/world.do")
//    public void todo1() {
//        System.out.println("Hello World");
//    }
//
//    @RequestMapping(value = {
//            "/world.do",
//            "/spring.do",
//            "/mybatis.do"
//    })
//    public void todo2() {
//        System.out.println("Hello World");
//        System.out.println("Hello Spring");
//        System.out.println("Hello MyBatis");
//    }
//
//    @RequestMapping(value = "/spring/{content}.do")
//    public void todo2(@PathVariable String content) {
//        System.out.println("Hello Spring " + content);
//    }
//
//    @RequestMapping(value = "/spring/{content:[a-z]+}.do")
//    public void todo3(@PathVariable String content) {
//        System.out.println("Hello Spring " + content);
//    }
//
//    @RequestMapping(value = "/get.do", method = RequestMethod.GET)
//    public void get() {
//        System.out.println("get ...");
//    }
//
//    @RequestMapping(value = "/post.do", method = RequestMethod.POST)
//    public void post() {
//        System.out.println("post ...");
//    }
//
//    @RequestMapping(value = "/put.do", method = RequestMethod.PUT)
//    public void put() {
//        System.out.println("put ...");
//    }
//
//    @RequestMapping(value = "/delete.do", method = RequestMethod.DELETE)
//    public void delete() {
//        System.out.println("delete ...");
//    }
//
//    @RequestMapping(value = "/get.do", method = RequestMethod.GET)
//    @GetMapping("/get.do")
//    public void get() {
//        System.out.println("get ...");
//    }
//
//    @RequestMapping(value = "/post.do", method = RequestMethod.POST)
//    @PostMapping("/post.do")
//    public void post() {
//        System.out.println("post ...");
//    }
//
//    @RequestMapping(value = "/put.do", method = RequestMethod.PUT)
//    @PutMapping("/put.do")
//    public void put() {
//        System.out.println("put ...");
//    }
//
//    @RequestMapping(value = "/delete.do", method = RequestMethod.DELETE)
//    @DeleteMapping("/delete.do")
//    public void delete() {
//        System.out.println("delete ...");
//    }
//
//    //设定必须包含username和age两个参数，且age参数不为10（可以有多个参数）
//    @RequestMapping(value = "/params.do", method = RequestMethod.GET, params = {"username", "age!=10"})
//    public void params() {
//        System.out.println("params ...");
//    }
//
//    @RequestMapping(value = "/headers.do", method = RequestMethod.GET, headers = "Host=localhost:8080")
//    public void headers() {
//        System.out.println("headers ...");
//    }
//
//    @RequestMapping(value = "/consumes.do", method = RequestMethod.POST, consumes = "application/json")
//    public void consumes() {
//        System.out.println("consumes ...");
//    }
//
//    @RequestMapping(value = "/produces.do", method = RequestMethod.POST, produces = "application/json")
//    public void produces() {
//        System.out.println("produces ...");
//    }
//
//    //接收单个参数
//    @RequestMapping("/getParam1.do")
//    public void getParam1(String username) {
//        System.out.println("getParam1 " + username);
//    }
//
//    //接收单个参数
//    @RequestMapping("/getParam1.do")
//
//    public void getParam1(@RequestParam("username") String name) {
//        System.out.println("getParam1 " + name);
//    }
//
//    //接收单个参数
//    @RequestMapping("/{username}.do")
//    public void getParam1(@PathVariable("username") String name) {
//        System.out.println("getParam1 " + name);
//    }
//
//    //接收多个参数
//    @RequestMapping("/getParam2.do")
//    public void getParam2(String username, String password) {
//        System.out.println("getParam1 " + username + " " + password);
//    }
//
//    //接收多个参数
//    @RequestMapping("/getParam2.do")
//    public void getParam2(@RequestParam("username") String name, @RequestParam("password") String pwd) {
//        System.out.println("getParam1 " + name + " " + pwd);
//    }
//
//    @RequestMapping("/{username}/{password}.do")
//    public void getParam2(@PathVariable("username") String name, @PathVariable("password") String pwd) {
//        System.out.println("getParam1 " + name + " " + pwd);
//    }
//
//    @RequestMapping(value = "/getParam3.do", method = RequestMethod.POST)
//    public void getParam3(@RequestBody User user) {
//        System.out.println("getParam3 " + user);
//    }
//
//    @RequestMapping(value = "/getParam3.do", method = RequestMethod.POST)
//    public void getParam3(@RequestBody User user) {
//        System.out.println("getParam3 " + user);
//    }
//
//    @RequestMapping(value = "/getParam4.do", method = RequestMethod.POST)
//    public void getParam4(@RequestParam("array[]") String[] array) {
//        System.out.println("getParam4 " + Arrays.toString(array));
//    }
//
//    @RequestMapping(value = "/getParam4.do", method = RequestMethod.POST)
//    public void getParam4(@RequestBody String[] array) {
//        System.out.println("getParam4 " + Arrays.toString(array));
//    }
//
//    @RequestMapping(value = "/getParam5.do", method = RequestMethod.POST)
//    public void getParam5(@RequestBody List<String> list) {
//        System.out.println("getParam5 " + list);
//    }
//
//    @RequestMapping(value = "/getParam5.do", method = RequestMethod.POST)
//    public void getParam5(@RequestBody Set<String> set) {
//        System.out.println("getParam5 " + set);
//    }
//
//    @RequestMapping(value = "/getParam5.do", method = RequestMethod.POST)
//    public void getParam5(@RequestParam("list[]") String[] array) {
//        System.out.println("getParam5 " + Arrays.toString(array));
//    }
//
//    @RequestMapping(value = "/getParam5.do", method = RequestMethod.POST)
//    public void getParam5(@RequestBody Map<String, String> map) {
//        System.out.println("getParam5 " + map);
//    }
//
//    @RequestMapping(value = "/getParam5.do", method = RequestMethod.POST)
//    public void getParam5(@RequestParam("map") Map<String, String> map) {
//        System.out.println("getParam5 " + map);
//    }
//
//    @RequestMapping(value = "/getParam4.do", method = RequestMethod.GET)
//    public void getParam4(@RequestParam("array[]") String[] array) {
//        System.out.println("getParam4 " + Arrays.toString(array));
//    }
//
//    @RequestMapping("/page.do")
//    public ModelAndView page() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("msg", "Hello World");
//        mv.setViewName("/WEB-INF/page.jsp");
//        return mv;
//    }
//
//    @RequestMapping("/page.do")
//    public ModelAndView page() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("msg", "Hello World");
//        mv.setViewName("page");
//        return mv;
//    }
//
//    @RequestMapping("/page.do")
//    public String page(Model model) {
//        model.addAttribute("msg", "Hello World");
//        return "page";
//    }
//
//    @RequestMapping("/myVoid.do")
//    public void myVoid(String name, String age, HttpServletResponse response) throws IOException {
//        //创建用户
//        User user = new User();
//        user.setName(name);
//        user.setAge(age);
//
//        //转为JSON
//        ObjectMapper om = new ObjectMapper();
//        String json = om.writeValueAsString(user);
//
//        //写到页面
//        PrintWriter pw = response.getWriter();
//        pw.write(json);
//        pw.flush();
//        pw.close();
//    }
//
//    @RequestMapping("/myObject.do")
//    @ResponseBody
//    public User myObject(String name, String age) {
//        //创建对象
//        User user = new User();
//        user.setName(name);
//        user.setAge(age);
//        //返回对象
//        return user;
//    }
//
//    @RequestMapping("/forward.do")
//    public ModelAndView forward() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("msg", "forward ...");
//        mv.setViewName("forward:/WEB-INF/page.jsp");
//        return mv;
//    }
//
//    @RequestMapping("/forward.do")
//    public String forward(Model model) {
//        model.addAttribute("msg", "forward ...");
//        return "forward:/WEB-INF/page.jsp";
//    }
//
//    @RequestMapping("/redirect.do")
//    public String redirect() {
//        System.out.println("redirect ...");
//        return "redirect:/page.jsp";
//    }
//
//    @RequestMapping("/loginPage.do")
//    public String loginPage() {
//        return "login";
//    }
//
//    @RequestMapping("/error.do")
//    public String error(String name, Integer age) throws UserException {
//        if (name == null) {
//            throw new UserNameException("姓名不正确");
//        }
//
//        if (age == null || (age < 18 && age > 60)) {
//            throw new UserAgeException("年龄不正确");
//        }
//        return "login";
//    }
//
//    @RequestMapping(value = "/upload.do", method = RequestMethod.POST)
//    @ResponseBody
//    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
//        // 文件不为空
//        if (!file.isEmpty()) {
//            // 文件存放目录
//            String catalog = "/fileUpload/";
//            // 文件存放路径
//            String path = request.getServletContext().getRealPath(catalog);
//            // 文件存放名称
//            String name = String.valueOf(new Date().getTime() + "_" + file.getOriginalFilename());
//            File destFile = new File(path, name);
//            // 文件保存操作
//            try {
//                file.transferTo(destFile);
//            } catch (IllegalStateException | IOException e) {
//                e.printStackTrace();
//            }
//            // 文件访问地址
//            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + catalog + name;
//            // 返回文件地址
//            return "success, the file url is : " + url;
//        } else {
//            return "error!";
//        }
//    }
//
//    @CrossOrigin
//    @GetMapping("/getUserInfo.do")
//    @ResponseBody
//    public User getUserInfo() {
//        User user = new User();
//        user.setName("张三");
//        user.setAge("18");
//        user.setBirthday(new Date());
//        System.out.println(user);
//        return user;
//    }
//
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }
//
//    @PostMapping("/submit.do")
//    public void submit(User user) {
//        System.out.println(user);
//    }
// 补充知识
//    @RequestMapping(value = "/getParam4.do", method = RequestMethod.GET)
//    public void getParam4(@RequestParam("array") String[] array) {
//        System.out.println("getParam4 " + Arrays.toString(array));
//    }
//    @RequestMapping(value = "/getParam5.do", method = RequestMethod.POST)
//    public void getParam5(@RequestParam("list[]") List<String> list) {
//        System.out.println("getParam5 " + list);
//    }
//    @RequestMapping(value = "/getParam6.do", method = RequestMethod.POST)
//    public void getParam6(@RequestBody Set<String> set) {
//        System.out.println("getParam6 " + set);
//    }

//    @RequestMapping(value = "/getParam7.do", method = RequestMethod.POST)
//    public void getParam7(@RequestBody Map<String, String> map) {
//        System.out.println("getParam7 " + map);
//    }

//    @RequestMapping(value = "/getParam3.do", method = RequestMethod.GET)
//    public void getParam3(@RequestParam User user) {
//        System.out.println("getParam3 " + user);
//    }

//    @RequestMapping("/getHeaderValue.do")
//    public void getHeaderValue(@RequestHeader("User-Agent") String userAgent) {
//        System.out.println("getHeaderValue " + userAgent);
//    }

    //    @RequestMapping("/getHeaderValue.do")
//    public void getHeaderValue(@RequestHeader Map<String,String> header) {
//        System.out.println("getHeaderValue " + header);
//    }
//    @RequestMapping("/{path}")
//    public void getHeaderValue(@MatrixVariable("low") Integer low,
//                               @MatrixVariable("brand") List<String> brand,
//                               @PathVariable("path") String path) {
//        System.out.println("low " + low);
//        System.out.println("brand " + brand);
//        System.out.println("path " + path);
//    }

    // /boss/1;age=20/2;age=10

//    @RequestMapping("/{bossId}/{empId}")
//    public void getHeaderValue(@MatrixVariable(value = "age", pathVar = "bossId") Integer bossAge,
//                     @MatrixVariable(value = "age", pathVar = "empId") Integer empAge,
//                     @PathVariable("bossId") String bossId,
//                     @PathVariable("empId") String empId) {
//        System.out.println(bossId + " age " + bossAge);
//        System.out.println(empId + " age " + empAge);
//    }

//    @RequestMapping("/getCookieValue.do")
//    public ModelAndView getCookieValue( Map cookies) {
//        System.out.println("getCookieValue " + cookies);
//    return  new ModelAndView("error");
//    }

//    @RequestMapping("/getCookieValue.do")
//    public ModelAndView getCookieValue() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("error");
//        return mv;
//    }
}
