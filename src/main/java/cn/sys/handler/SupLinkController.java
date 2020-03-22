package cn.sys.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.sys.entity.SupLink;
import cn.sys.entity.SupLinkExample;
import cn.sys.entity.SupLink;
import cn.sys.service.SupLinkService;
import cn.sys.utils.PageResult;
import cn.sys.utils.Result;

@RestController
@RequestMapping("SupLink")
public class SupLinkController {

    @Autowired
    private SupLinkService SupLinkService;

    @RequestMapping("findAll")
    public List<SupLink> findALl(){
        return SupLinkService.findAll();
    }

    @RequestMapping("save")
    public Result add(SupLink SupLink){
        try {
            if(SupLink.getId()==null){
                this.SupLinkService.add(SupLink);
            }else{
                this.SupLinkService.update(SupLink);
            }
            return new Result(true, "成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "失败");
        }
    }

    @RequestMapping("findPage")
    public PageResult findPage(SupLink SupLink,Integer page,Integer rows){
        SupLinkExample example = new SupLinkExample();
        return this.SupLinkService.findPage(example,page,rows);
    }

    @RequestMapping("findOne")
    public SupLink findOne(Integer id){
        SupLink SupLink = this.SupLinkService.findOne(id);
        return SupLink;
    }

    @RequestMapping("findList")
    public List<SupLink> findList(SupLink SupLink){
        SupLinkExample example = new SupLinkExample();
        example.createCriteria().andIdEqualTo(SupLink.getId());
        return this.SupLinkService.findList(example);
    }

    @RequestMapping("update")
    public Result update( SupLink SupLink){
        try {
            this.SupLinkService.update(SupLink);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    @RequestMapping(value="delete")
    public Result delete(String ids,Integer a){

        try {
            for (String id : ids.split(",")) {
                this.SupLinkService.delete(Integer.parseInt(id));
            }
            return new Result(true, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "操作失败");
        }
    }

}
