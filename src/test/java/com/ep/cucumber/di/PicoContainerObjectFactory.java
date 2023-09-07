package com.ep.cucumber.di;

import com.ep.cucumber.actions.StepActions;
import com.ep.cucumber.pages.admin.AdminAddLocationPage;
import com.ep.cucumber.pages.admin.AdminAddWorkShiftPage;
import com.ep.cucumber.pages.admin.AdminPage;
import com.ep.cucumber.pages.common.ApplicationPage;
import com.ep.cucumber.pages.common.HomePage;
import com.ep.cucumber.pages.common.LeftPanelPage;
import com.ep.cucumber.pages.common.LoginPage;
import com.ep.cucumber.pages.leave.AssignLeavePage;
import com.ep.cucumber.pages.leave.ConfigureHolidayPage;
import com.ep.cucumber.pages.leave.ConfigureLeavePeriodPage;
import com.ep.cucumber.pages.leave.ConfigureLeaveTypePage;
import com.ep.cucumber.pages.leave.ConfigureWorkWeekPage;
import com.ep.cucumber.pages.leave.LeaveAddEntitlementsPage;
import com.ep.cucumber.pages.leave.LeaveApprovePage;
import com.ep.cucumber.pages.leave.LeaveCancelPage;
import com.ep.cucumber.pages.performance.PerformanceAddKPIPage;
import com.ep.cucumber.pages.performance.PerformanceAddReviewPage;
import com.ep.cucumber.pages.performance.PerformanceAddTrackerPage;
import com.ep.cucumber.pages.pim.PIMAddEmployeePage;
import com.ep.cucumber.pages.pim.PIMContactDetailsPage;
import com.ep.cucumber.pages.pim.PIMEmployeeListPage;
import com.ep.cucumber.pages.pim.PIMJobDetailsPage;
import com.ep.cucumber.pages.pim.PIMPersonalDetailsPage;
import com.ep.cucumber.pages.time.EditTimeSheetPage;
import com.ep.cucumber.pages.time.EmployeeTimeSheetPage;
import com.ep.cucumber.pages.time.ViewEmployeeTimeSheetPage;

import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

public class PicoContainerObjectFactory implements ObjectFactory {

	private final PicoFactory delegate = new PicoFactory();

	public PicoContainerObjectFactory() {

		addClass(ApplicationPage.class);
		addClass(HomePage.class);
		addClass(LoginPage.class);
		addClass(LeftPanelPage.class);
		addClass(StepActions.class);
		addClass(AssignLeavePage.class);
		addClass(ConfigureHolidayPage.class);
		addClass(ConfigureLeavePeriodPage.class);
		addClass(ConfigureLeaveTypePage.class);
		addClass(ConfigureWorkWeekPage.class);
		addClass(LeaveAddEntitlementsPage.class);
		addClass(LeaveApprovePage.class);
		addClass(LeaveCancelPage.class);
		addClass(ViewEmployeeTimeSheetPage.class);
		addClass(PIMAddEmployeePage.class);
		addClass(PIMContactDetailsPage.class);
		addClass(PIMEmployeeListPage.class);
		addClass(PIMJobDetailsPage.class);
		addClass(PIMPersonalDetailsPage.class);
		addClass(EditTimeSheetPage.class);
		addClass(EmployeeTimeSheetPage.class);
		addClass(ViewEmployeeTimeSheetPage.class);
		addClass(AdminAddLocationPage.class);
		addClass(AdminAddWorkShiftPage.class);
		addClass(AdminPage.class);
		addClass(PerformanceAddKPIPage.class);
		addClass(PerformanceAddReviewPage.class);
		addClass(PerformanceAddTrackerPage.class);

	}

	@Override
	public void start() {
		delegate.start();
	}

	@Override
	public void stop() {
		delegate.stop();
	}

	@Override
	public boolean addClass(Class<?> clazz) {
		return delegate.addClass(clazz);
	}

	@Override
	public <T> T getInstance(Class<T> clazz) {
		return delegate.getInstance(clazz);
	}
}
