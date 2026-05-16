# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateViewDetails(object):
    """
    The data to update a view.
    """

    #: A constant which can be used with the update_mode property of a UpdateViewDetails.
    #: This constant has a value of "RENAME_VIEW"
    UPDATE_MODE_RENAME_VIEW = "RENAME_VIEW"

    #: A constant which can be used with the update_mode property of a UpdateViewDetails.
    #: This constant has a value of "ADD_PROPERTIES"
    UPDATE_MODE_ADD_PROPERTIES = "ADD_PROPERTIES"

    #: A constant which can be used with the update_mode property of a UpdateViewDetails.
    #: This constant has a value of "DROP_PROPERTIES"
    UPDATE_MODE_DROP_PROPERTIES = "DROP_PROPERTIES"

    #: A constant which can be used with the update_mode property of a UpdateViewDetails.
    #: This constant has a value of "UPDATE_VIEW_DESCRIPTION"
    UPDATE_MODE_UPDATE_VIEW_DESCRIPTION = "UPDATE_VIEW_DESCRIPTION"

    #: A constant which can be used with the update_mode property of a UpdateViewDetails.
    #: This constant has a value of "UPDATE_VIEW_QUERY"
    UPDATE_MODE_UPDATE_VIEW_QUERY = "UPDATE_VIEW_QUERY"

    #: A constant which can be used with the update_mode property of a UpdateViewDetails.
    #: This constant has a value of "UPDATE_COLUMN_DESCRIPTION"
    UPDATE_MODE_UPDATE_COLUMN_DESCRIPTION = "UPDATE_COLUMN_DESCRIPTION"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateViewDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param update_mode:
            The value to assign to the update_mode property of this UpdateViewDetails.
            Allowed values for this property are: "RENAME_VIEW", "ADD_PROPERTIES", "DROP_PROPERTIES", "UPDATE_VIEW_DESCRIPTION", "UPDATE_VIEW_QUERY", "UPDATE_COLUMN_DESCRIPTION"
        :type update_mode: str

        :param view_update_details:
            The value to assign to the view_update_details property of this UpdateViewDetails.
        :type view_update_details: oci.aidataplatform_dp.models.ViewUpdateDetails

        """
        self.swagger_types = {
            'update_mode': 'str',
            'view_update_details': 'ViewUpdateDetails'
        }

        self.attribute_map = {
            'update_mode': 'updateMode',
            'view_update_details': 'viewUpdateDetails'
        }

        self._update_mode = None
        self._view_update_details = None

    @property
    def update_mode(self):
        """
        **[Required]** Gets the update_mode of this UpdateViewDetails.
        The mode of update for a view

        Allowed values for this property are: "RENAME_VIEW", "ADD_PROPERTIES", "DROP_PROPERTIES", "UPDATE_VIEW_DESCRIPTION", "UPDATE_VIEW_QUERY", "UPDATE_COLUMN_DESCRIPTION"


        :return: The update_mode of this UpdateViewDetails.
        :rtype: str
        """
        return self._update_mode

    @update_mode.setter
    def update_mode(self, update_mode):
        """
        Sets the update_mode of this UpdateViewDetails.
        The mode of update for a view


        :param update_mode: The update_mode of this UpdateViewDetails.
        :type: str
        """
        allowed_values = ["RENAME_VIEW", "ADD_PROPERTIES", "DROP_PROPERTIES", "UPDATE_VIEW_DESCRIPTION", "UPDATE_VIEW_QUERY", "UPDATE_COLUMN_DESCRIPTION"]
        if not value_allowed_none_or_none_sentinel(update_mode, allowed_values):
            raise ValueError(
                "Invalid value for `update_mode`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._update_mode = update_mode

    @property
    def view_update_details(self):
        """
        Gets the view_update_details of this UpdateViewDetails.

        :return: The view_update_details of this UpdateViewDetails.
        :rtype: oci.aidataplatform_dp.models.ViewUpdateDetails
        """
        return self._view_update_details

    @view_update_details.setter
    def view_update_details(self, view_update_details):
        """
        Sets the view_update_details of this UpdateViewDetails.

        :param view_update_details: The view_update_details of this UpdateViewDetails.
        :type: oci.aidataplatform_dp.models.ViewUpdateDetails
        """
        self._view_update_details = view_update_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
