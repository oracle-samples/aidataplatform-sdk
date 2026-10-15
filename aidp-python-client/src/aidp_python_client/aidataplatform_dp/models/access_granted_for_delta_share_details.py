# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForDeltaShareDetails(object):
    """
    Lakeproxy DeltaShare resource details.
    """

    #: A constant which can be used with the delta_share_operation_target property of a AccessGrantedForDeltaShareDetails.
    #: This constant has a value of "CENTRIFY_CATALOG"
    DELTA_SHARE_OPERATION_TARGET_CENTRIFY_CATALOG = "CENTRIFY_CATALOG"

    #: A constant which can be used with the delta_share_operation_target property of a AccessGrantedForDeltaShareDetails.
    #: This constant has a value of "SHARE"
    DELTA_SHARE_OPERATION_TARGET_SHARE = "SHARE"

    #: A constant which can be used with the delta_share_operation_target property of a AccessGrantedForDeltaShareDetails.
    #: This constant has a value of "RECIPIENT"
    DELTA_SHARE_OPERATION_TARGET_RECIPIENT = "RECIPIENT"

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForDeltaShareDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param delta_share_operation_target:
            The value to assign to the delta_share_operation_target property of this AccessGrantedForDeltaShareDetails.
            Allowed values for this property are: "CENTRIFY_CATALOG", "SHARE", "RECIPIENT", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type delta_share_operation_target: str

        :param share_name:
            The value to assign to the share_name property of this AccessGrantedForDeltaShareDetails.
        :type share_name: str

        :param recipient_name:
            The value to assign to the recipient_name property of this AccessGrantedForDeltaShareDetails.
        :type recipient_name: str

        """
        self.swagger_types = {
            'delta_share_operation_target': 'str',
            'share_name': 'str',
            'recipient_name': 'str'
        }
        self.attribute_map = {
            'delta_share_operation_target': 'deltaShareOperationTarget',
            'share_name': 'shareName',
            'recipient_name': 'recipientName'
        }
        self._delta_share_operation_target = None
        self._share_name = None
        self._recipient_name = None

    @property
    def delta_share_operation_target(self):
        """
        **[Required]** Gets the delta_share_operation_target of this AccessGrantedForDeltaShareDetails.
        Lakeproxy deltaShareOperationTarget.

        Allowed values for this property are: "CENTRIFY_CATALOG", "SHARE", "RECIPIENT", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The delta_share_operation_target of this AccessGrantedForDeltaShareDetails.
        :rtype: str
        """
        return self._delta_share_operation_target

    @delta_share_operation_target.setter
    def delta_share_operation_target(self, delta_share_operation_target):
        """
        Sets the delta_share_operation_target of this AccessGrantedForDeltaShareDetails.
        Lakeproxy deltaShareOperationTarget.


        :param delta_share_operation_target: The delta_share_operation_target of this AccessGrantedForDeltaShareDetails.
        :type: str
        """
        allowed_values = ["CENTRIFY_CATALOG", "SHARE", "RECIPIENT"]
        if not value_allowed_none_or_none_sentinel(delta_share_operation_target, allowed_values):
            delta_share_operation_target = 'UNKNOWN_ENUM_VALUE'
        self._delta_share_operation_target = delta_share_operation_target

    @property
    def share_name(self):
        """
        Gets the share_name of this AccessGrantedForDeltaShareDetails.
        Lakeproxy shareName.


        :return: The share_name of this AccessGrantedForDeltaShareDetails.
        :rtype: str
        """
        return self._share_name

    @share_name.setter
    def share_name(self, share_name):
        """
        Sets the share_name of this AccessGrantedForDeltaShareDetails.
        Lakeproxy shareName.


        :param share_name: The share_name of this AccessGrantedForDeltaShareDetails.
        :type: str
        """
        self._share_name = share_name

    @property
    def recipient_name(self):
        """
        Gets the recipient_name of this AccessGrantedForDeltaShareDetails.
        Lakeproxy recipientName.


        :return: The recipient_name of this AccessGrantedForDeltaShareDetails.
        :rtype: str
        """
        return self._recipient_name

    @recipient_name.setter
    def recipient_name(self, recipient_name):
        """
        Sets the recipient_name of this AccessGrantedForDeltaShareDetails.
        Lakeproxy recipientName.


        :param recipient_name: The recipient_name of this AccessGrantedForDeltaShareDetails.
        :type: str
        """
        self._recipient_name = recipient_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
