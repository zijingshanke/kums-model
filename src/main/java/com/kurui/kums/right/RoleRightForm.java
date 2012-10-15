package com.kurui.kums.right;

import org.apache.struts.action.ActionForm;

public class RoleRightForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roleID = "";
	private String rightKey = "";
	private String rightName = "";
	private String rightCode = "";
	private String rightDescription = "";
	private String rightAction = "";
	private String rightEvent = "";
	private String[] selectedRightItems = new String[0];

	private String selectedRightItem = "";
	private String thisAction = "";

	/**
	 * @return Returns the thisAction.
	 */
	public String getThisAction() {
		return thisAction;
	}

	/**
	 * @param thisAction
	 *            The thisAction to set.
	 */
	public void setThisAction(String thisAction) {
		this.thisAction = thisAction;
	}

	/**
	 * @return Returns the rightName.
	 */
	public String getRightName() {
		return rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}

	public String[] getSelectedRightItems() {
		return selectedRightItems;
	}

	/**
	 * @param selectedRightItems
	 *            The selectedRightItems to set.
	 */
	public void setSelectedRightItems(String[] selectedRightItems) {
		this.selectedRightItems = selectedRightItems;
	}

	/**
	 * @return Returns the rightKey.
	 */
	public String getRightKey() {
		if (rightKey.equals(""))
			rightKey = "-1";

		return rightKey;
	}

	/**
	 * @param rightKey
	 *            The rightKey to set.
	 */
	public void setRightKey(String rightKey) {
		this.rightKey = rightKey;
	}

	/**
	 * @return Returns the rightDescription.
	 */
	public String getRightDescription() {
		return rightDescription;
	}

	/**
	 * @param rightDescription
	 *            The rightDescription to set.
	 */
	public void setRightDescription(String rightDescription) {
		this.rightDescription = rightDescription;
	}

	/**
	 * @return Returns the rightCode.
	 */
	public String getRightCode() {
		return rightCode;
	}

	/**
	 * @param rightCode
	 *            The rightCode to set.
	 */
	public void setRightCode(String rightCode) {
		this.rightCode = rightCode;
	}

	public String getSelectedRightItem() {
		return selectedRightItem;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getRightAction() {
		return rightAction;
	}

	public void setRightAction(String rightAction) {
		this.rightAction = rightAction;
	}

	public String getRightEvent() {
		return rightEvent;
	}

	public void setRightEvent(String rightEvent) {
		this.rightEvent = rightEvent;
	}

}
