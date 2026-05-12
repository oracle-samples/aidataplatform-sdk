# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KnowledgeBaseJobRunData(object):
    """
    Description of KB Job Run Statistics.
    """

    #: A constant which can be used with the trigger_type property of a KnowledgeBaseJobRunData.
    #: This constant has a value of "NOTEBOOK"
    TRIGGER_TYPE_NOTEBOOK = "NOTEBOOK"

    #: A constant which can be used with the trigger_type property of a KnowledgeBaseJobRunData.
    #: This constant has a value of "OTHER"
    TRIGGER_TYPE_OTHER = "OTHER"

    def __init__(self, **kwargs):
        """
        Initializes a new KnowledgeBaseJobRunData object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param records_added:
            The value to assign to the records_added property of this KnowledgeBaseJobRunData.
        :type records_added: int

        :param records_deleted:
            The value to assign to the records_deleted property of this KnowledgeBaseJobRunData.
        :type records_deleted: int

        :param records_updated:
            The value to assign to the records_updated property of this KnowledgeBaseJobRunData.
        :type records_updated: int

        :param records_added_updated_size:
            The value to assign to the records_added_updated_size property of this KnowledgeBaseJobRunData.
        :type records_added_updated_size: int

        :param trigger_type:
            The value to assign to the trigger_type property of this KnowledgeBaseJobRunData.
            Allowed values for this property are: "NOTEBOOK", "OTHER"
        :type trigger_type: str

        """
        self.swagger_types = {
            'records_added': 'int',
            'records_deleted': 'int',
            'records_updated': 'int',
            'records_added_updated_size': 'int',
            'trigger_type': 'str'
        }

        self.attribute_map = {
            'records_added': 'recordsAdded',
            'records_deleted': 'recordsDeleted',
            'records_updated': 'recordsUpdated',
            'records_added_updated_size': 'recordsAddedUpdatedSize',
            'trigger_type': 'triggerType'
        }

        self._records_added = None
        self._records_deleted = None
        self._records_updated = None
        self._records_added_updated_size = None
        self._trigger_type = None

    @property
    def records_added(self):
        """
        Gets the records_added of this KnowledgeBaseJobRunData.
        Number of records/files added as part of this job run


        :return: The records_added of this KnowledgeBaseJobRunData.
        :rtype: int
        """
        return self._records_added

    @records_added.setter
    def records_added(self, records_added):
        """
        Sets the records_added of this KnowledgeBaseJobRunData.
        Number of records/files added as part of this job run


        :param records_added: The records_added of this KnowledgeBaseJobRunData.
        :type: int
        """
        self._records_added = records_added

    @property
    def records_deleted(self):
        """
        Gets the records_deleted of this KnowledgeBaseJobRunData.
        Number of records/files deleted as part of this job run


        :return: The records_deleted of this KnowledgeBaseJobRunData.
        :rtype: int
        """
        return self._records_deleted

    @records_deleted.setter
    def records_deleted(self, records_deleted):
        """
        Sets the records_deleted of this KnowledgeBaseJobRunData.
        Number of records/files deleted as part of this job run


        :param records_deleted: The records_deleted of this KnowledgeBaseJobRunData.
        :type: int
        """
        self._records_deleted = records_deleted

    @property
    def records_updated(self):
        """
        Gets the records_updated of this KnowledgeBaseJobRunData.
        Number of records/files updated as part of this job run


        :return: The records_updated of this KnowledgeBaseJobRunData.
        :rtype: int
        """
        return self._records_updated

    @records_updated.setter
    def records_updated(self, records_updated):
        """
        Sets the records_updated of this KnowledgeBaseJobRunData.
        Number of records/files updated as part of this job run


        :param records_updated: The records_updated of this KnowledgeBaseJobRunData.
        :type: int
        """
        self._records_updated = records_updated

    @property
    def records_added_updated_size(self):
        """
        Gets the records_added_updated_size of this KnowledgeBaseJobRunData.
        Size of all the records/files processed as part of this job run


        :return: The records_added_updated_size of this KnowledgeBaseJobRunData.
        :rtype: int
        """
        return self._records_added_updated_size

    @records_added_updated_size.setter
    def records_added_updated_size(self, records_added_updated_size):
        """
        Sets the records_added_updated_size of this KnowledgeBaseJobRunData.
        Size of all the records/files processed as part of this job run


        :param records_added_updated_size: The records_added_updated_size of this KnowledgeBaseJobRunData.
        :type: int
        """
        self._records_added_updated_size = records_added_updated_size

    @property
    def trigger_type(self):
        """
        Gets the trigger_type of this KnowledgeBaseJobRunData.
        Hint for how job run is getting started.

        Allowed values for this property are: "NOTEBOOK", "OTHER"


        :return: The trigger_type of this KnowledgeBaseJobRunData.
        :rtype: str
        """
        return self._trigger_type

    @trigger_type.setter
    def trigger_type(self, trigger_type):
        """
        Sets the trigger_type of this KnowledgeBaseJobRunData.
        Hint for how job run is getting started.


        :param trigger_type: The trigger_type of this KnowledgeBaseJobRunData.
        :type: str
        """
        allowed_values = ["NOTEBOOK", "OTHER"]
        if not value_allowed_none_or_none_sentinel(trigger_type, allowed_values):
            raise ValueError(
                "Invalid value for `trigger_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._trigger_type = trigger_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
