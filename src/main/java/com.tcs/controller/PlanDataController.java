package com.tcs.controller;

import com.tcs.model.PlanData;
import com.tcs.services.PlanDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 716644 on 5/13/2015.
 */
@Controller
@RequestMapping("rest/planData")
public class PlanDataController {
    @Autowired
    private PlanDataService pdService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<PlanData> findAll()
    {
        return pdService.findAll();
    }


    @RequestMapping(value = "{BDWMAPPINGID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PlanData findPlanById(@PathVariable("BDWMAPPINGID") int BDWMAPPINGID)
    {
        return pdService.findPlanByBDWMAPPINGID(BDWMAPPINGID);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<PlanData> create(@RequestBody PlanData planData)
    {
        PlanData savedPlan=pdService.create(planData);
        return new ResponseEntity<PlanData>(savedPlan, HttpStatus.CREATED);

    }

    @RequestMapping(value="", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<PlanData> update(@RequestBody PlanData planData)
    {
        PlanData savedPlan = pdService.update(planData);
        return new ResponseEntity<PlanData>(savedPlan, HttpStatus.OK);
    }

    //Update por soft delete
    /*
    @RequestMapping(value="", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<PlanData> delete(@RequestBody PlanData planData)
    {
        PlanData savedPlan = pdService.deletePlan(planData);
        return new ResponseEntity<PlanData>(savedPlan, HttpStatus.OK);
    }*/


    @RequestMapping(value = {"{cyYear}","/","{active}"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<PlanData> findPlanByCyYearAndActive(@PathVariable(value = "cyYear") int cyYear, @PathVariable(value = "active")int active)
    {
        return pdService.findPlanByCyYearAndActive(cyYear, active);
    }

    @RequestMapping(value = {"{cyYear}","/","{active}","/","{cyPbpId}","/","{cySegment}","/","{cyContractNum}"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PlanData findPlanByCyYearAndActiveAndCyPbpIdAndCySegmentAndCyContractNum(@PathVariable(value = "cyYear")int cyYear, @PathVariable(value = "active")int active, @PathVariable(value = "cyPbpId")String cyPbpId, @PathVariable(value = "cySegment")String cySegment, @PathVariable(value = "cyContractNum")String cyContractNum)
    {
        return pdService.findPlanByCyYearAndActiveAndCyPbpIdAndCySegmentAndCyContractNum(cyYear, active, cyPbpId, cySegment, cyContractNum);
    }



}
