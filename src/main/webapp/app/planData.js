/**
 * Created by 716644 on 5/13/2015.
 */

var app = angular.module("PlanDataAngular",[]); //Modulo Angular

//Controlador Angular <<Llama al servicio>>
app.controller("PlanDataController", function($scope, planDataService){

    $scope.plandatas=[];
    planDataService.fetchAll().success(function(data){
        $scope.plandatas=data;
    }).error(function(data,status){
        alert("Unable to load Data ("+status+") ");
    });

    $scope.create  = function(plandata){
        planDataService.create(plandata).success(function(data){
            $scope.plandatas.push(data);
            $scope.newplandata={};
            alert("Record created success");
        }).error(function(data,status){
            alert("Unable to create record "+status);
        });
    };


});

app.factory("planDataService", function($http){
    return {
        fetchAll: function(){
            return $http.get("rest/planData");
        },
        /*remove: function(userId){
            return $http.delete("rest/planData/"+userId);
        },*/
        create: function(planData){
            return $http.post("rest/planData", planData);

        },
        update: function(planData){
            return $http.put("rest/planData", planData);
        },
        fetchByPlanYearAndActive: function(planYear, active) {
            return $http.get("rest/planData/"+planYear+"/"+active);
        }
    }
});