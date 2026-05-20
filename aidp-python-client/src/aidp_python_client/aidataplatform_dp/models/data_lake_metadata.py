# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DataLakeMetadata(object):
    """
    Metadata of the dataLake
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DataLakeMetadata object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param audit_log_id:
            The value to assign to the audit_log_id property of this DataLakeMetadata.
        :type audit_log_id: str

        :param log_group_id:
            The value to assign to the log_group_id property of this DataLakeMetadata.
        :type log_group_id: str

        :param is_audit_enabled:
            The value to assign to the is_audit_enabled property of this DataLakeMetadata.
        :type is_audit_enabled: bool

        :param audit_retention_period:
            The value to assign to the audit_retention_period property of this DataLakeMetadata.
        :type audit_retention_period: int

        """
        self.swagger_types = {
            'audit_log_id': 'str',
            'log_group_id': 'str',
            'is_audit_enabled': 'bool',
            'audit_retention_period': 'int'
        }

        self.attribute_map = {
            'audit_log_id': 'auditLogId',
            'log_group_id': 'logGroupId',
            'is_audit_enabled': 'isAuditEnabled',
            'audit_retention_period': 'auditRetentionPeriod'
        }

        self._audit_log_id = None
        self._log_group_id = None
        self._is_audit_enabled = None
        self._audit_retention_period = None

    @property
    def audit_log_id(self):
        """
        Gets the audit_log_id of this DataLakeMetadata.
        Log object Id for DataLake logs


        :return: The audit_log_id of this DataLakeMetadata.
        :rtype: str
        """
        return self._audit_log_id

    @audit_log_id.setter
    def audit_log_id(self, audit_log_id):
        """
        Sets the audit_log_id of this DataLakeMetadata.
        Log object Id for DataLake logs


        :param audit_log_id: The audit_log_id of this DataLakeMetadata.
        :type: str
        """
        self._audit_log_id = audit_log_id

    @property
    def log_group_id(self):
        """
        Gets the log_group_id of this DataLakeMetadata.
        log groupId for the DataLake


        :return: The log_group_id of this DataLakeMetadata.
        :rtype: str
        """
        return self._log_group_id

    @log_group_id.setter
    def log_group_id(self, log_group_id):
        """
        Sets the log_group_id of this DataLakeMetadata.
        log groupId for the DataLake


        :param log_group_id: The log_group_id of this DataLakeMetadata.
        :type: str
        """
        self._log_group_id = log_group_id

    @property
    def is_audit_enabled(self):
        """
        Gets the is_audit_enabled of this DataLakeMetadata.
        is Audit enabled for the DataLake


        :return: The is_audit_enabled of this DataLakeMetadata.
        :rtype: bool
        """
        return self._is_audit_enabled

    @is_audit_enabled.setter
    def is_audit_enabled(self, is_audit_enabled):
        """
        Sets the is_audit_enabled of this DataLakeMetadata.
        is Audit enabled for the DataLake


        :param is_audit_enabled: The is_audit_enabled of this DataLakeMetadata.
        :type: bool
        """
        self._is_audit_enabled = is_audit_enabled

    @property
    def audit_retention_period(self):
        """
        Gets the audit_retention_period of this DataLakeMetadata.
        DataLake Retention period for audit logs


        :return: The audit_retention_period of this DataLakeMetadata.
        :rtype: int
        """
        return self._audit_retention_period

    @audit_retention_period.setter
    def audit_retention_period(self, audit_retention_period):
        """
        Sets the audit_retention_period of this DataLakeMetadata.
        DataLake Retention period for audit logs


        :param audit_retention_period: The audit_retention_period of this DataLakeMetadata.
        :type: int
        """
        self._audit_retention_period = audit_retention_period

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
