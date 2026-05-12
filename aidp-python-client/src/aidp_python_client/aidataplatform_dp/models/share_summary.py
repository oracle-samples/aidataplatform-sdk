# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ShareSummary(object):
    """
    Summary information about a share.
    """

    #: A constant which can be used with the lifecycle_state property of a ShareSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    def __init__(self, **kwargs):
        """
        Initializes a new ShareSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this ShareSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this ShareSummary.
        :type display_name: str

        :param recipient_count:
            The value to assign to the recipient_count property of this ShareSummary.
        :type recipient_count: int

        :param asset_count:
            The value to assign to the asset_count property of this ShareSummary.
        :type asset_count: int

        :param description:
            The value to assign to the description property of this ShareSummary.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this ShareSummary.
        :type time_created: datetime

        :param created_by:
            The value to assign to the created_by property of this ShareSummary.
        :type created_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this ShareSummary.
            Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param time_updated:
            The value to assign to the time_updated property of this ShareSummary.
        :type time_updated: datetime

        :param updated_by:
            The value to assign to the updated_by property of this ShareSummary.
        :type updated_by: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'recipient_count': 'int',
            'asset_count': 'int',
            'description': 'str',
            'time_created': 'datetime',
            'created_by': 'str',
            'lifecycle_state': 'str',
            'time_updated': 'datetime',
            'updated_by': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'recipient_count': 'recipientCount',
            'asset_count': 'assetCount',
            'description': 'description',
            'time_created': 'timeCreated',
            'created_by': 'createdBy',
            'lifecycle_state': 'lifecycleState',
            'time_updated': 'timeUpdated',
            'updated_by': 'updatedBy'
        }

        self._key = None
        self._display_name = None
        self._recipient_count = None
        self._asset_count = None
        self._description = None
        self._time_created = None
        self._created_by = None
        self._lifecycle_state = None
        self._time_updated = None
        self._updated_by = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this ShareSummary.
        Unique identifier for this share in AI Data Platform Workbench instance.


        :return: The key of this ShareSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ShareSummary.
        Unique identifier for this share in AI Data Platform Workbench instance.


        :param key: The key of this ShareSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this ShareSummary.
        A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.


        :return: The display_name of this ShareSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ShareSummary.
        A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.


        :param display_name: The display_name of this ShareSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def recipient_count(self):
        """
        Gets the recipient_count of this ShareSummary.
        The number of recipients who have access on this share.


        :return: The recipient_count of this ShareSummary.
        :rtype: int
        """
        return self._recipient_count

    @recipient_count.setter
    def recipient_count(self, recipient_count):
        """
        Sets the recipient_count of this ShareSummary.
        The number of recipients who have access on this share.


        :param recipient_count: The recipient_count of this ShareSummary.
        :type: int
        """
        self._recipient_count = recipient_count

    @property
    def asset_count(self):
        """
        Gets the asset_count of this ShareSummary.
        The number of assets in this share.


        :return: The asset_count of this ShareSummary.
        :rtype: int
        """
        return self._asset_count

    @asset_count.setter
    def asset_count(self, asset_count):
        """
        Sets the asset_count of this ShareSummary.
        The number of assets in this share.


        :param asset_count: The asset_count of this ShareSummary.
        :type: int
        """
        self._asset_count = asset_count

    @property
    def description(self):
        """
        Gets the description of this ShareSummary.
        A description associated with this share.


        :return: The description of this ShareSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ShareSummary.
        A description associated with this share.


        :param description: The description of this ShareSummary.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this ShareSummary.
        The date and time the Delta Share was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_created of this ShareSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this ShareSummary.
        The date and time the Delta Share was created, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_created: The time_created of this ShareSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def created_by(self):
        """
        **[Required]** Gets the created_by of this ShareSummary.
        The ID of the user who created the share.


        :return: The created_by of this ShareSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this ShareSummary.
        The ID of the user who created the share.


        :param created_by: The created_by of this ShareSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this ShareSummary.
        The state of the Share.

        Allowed values for this property are: "ACTIVE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this ShareSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this ShareSummary.
        The state of the Share.


        :param lifecycle_state: The lifecycle_state of this ShareSummary.
        :type: str
        """
        allowed_values = ["ACTIVE"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def time_updated(self):
        """
        Gets the time_updated of this ShareSummary.
        The date and time the Delta Share was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :return: The time_updated of this ShareSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this ShareSummary.
        The date and time the Delta Share was updated, in the format defined by <a href=\"https://tools.ietf.org/html/rfc3339\" target=\"_blank\" rel=\"noopener noreferrer\">RFC 3339</a>.
        Example: `2016-08-25T21:10:29.600Z`


        :param time_updated: The time_updated of this ShareSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def updated_by(self):
        """
        Gets the updated_by of this ShareSummary.
        The ID of the user who last updated the share.


        :return: The updated_by of this ShareSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this ShareSummary.
        The ID of the user who last updated the share.


        :param updated_by: The updated_by of this ShareSummary.
        :type: str
        """
        self._updated_by = updated_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
