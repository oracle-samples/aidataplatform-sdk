# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageAuditLogsDetails(object):
    """
    manage audit log details
    """

    #: A constant which can be used with the action property of a ManageAuditLogsDetails.
    #: This constant has a value of "ENABLE"
    ACTION_ENABLE = "ENABLE"

    #: A constant which can be used with the action property of a ManageAuditLogsDetails.
    #: This constant has a value of "DISABLE"
    ACTION_DISABLE = "DISABLE"

    def __init__(self, **kwargs):
        """
        Initializes a new ManageAuditLogsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this ManageAuditLogsDetails.
            Allowed values for this property are: "ENABLE", "DISABLE"
        :type action: str

        :param retention_period:
            The value to assign to the retention_period property of this ManageAuditLogsDetails.
        :type retention_period: int

        """
        self.swagger_types = {
            'action': 'str',
            'retention_period': 'int'
        }

        self.attribute_map = {
            'action': 'action',
            'retention_period': 'retentionPeriod'
        }

        self._action = None
        self._retention_period = None

    @property
    def action(self):
        """
        Gets the action of this ManageAuditLogsDetails.
        action to enable or disable the logs

        Allowed values for this property are: "ENABLE", "DISABLE"


        :return: The action of this ManageAuditLogsDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this ManageAuditLogsDetails.
        action to enable or disable the logs


        :param action: The action of this ManageAuditLogsDetails.
        :type: str
        """
        allowed_values = ["ENABLE", "DISABLE"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def retention_period(self):
        """
        Gets the retention_period of this ManageAuditLogsDetails.
        Retention period of the audit logs


        :return: The retention_period of this ManageAuditLogsDetails.
        :rtype: int
        """
        return self._retention_period

    @retention_period.setter
    def retention_period(self, retention_period):
        """
        Sets the retention_period of this ManageAuditLogsDetails.
        Retention period of the audit logs


        :param retention_period: The retention_period of this ManageAuditLogsDetails.
        :type: int
        """
        self._retention_period = retention_period

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
