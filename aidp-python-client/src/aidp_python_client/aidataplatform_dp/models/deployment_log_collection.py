# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentLogCollection(object):
    """
    Result of searching deployment lifecycle logs.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentLogCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this DeploymentLogCollection.
        :type deployment_id: str

        :param logs:
            The value to assign to the logs property of this DeploymentLogCollection.
        :type logs: oci.aidataplatform_dp.models.DeploymentLogPage

        :param query:
            The value to assign to the query property of this DeploymentLogCollection.
        :type query: oci.aidataplatform_dp.models.DeploymentLogQueryEcho

        :param coverage:
            The value to assign to the coverage property of this DeploymentLogCollection.
        :type coverage: oci.aidataplatform_dp.models.DeploymentLogCoverage

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'logs': 'DeploymentLogPage',
            'query': 'DeploymentLogQueryEcho',
            'coverage': 'DeploymentLogCoverage'
        }
        self.attribute_map = {
            'deployment_id': 'deploymentId',
            'logs': 'logs',
            'query': 'query',
            'coverage': 'coverage'
        }
        self._deployment_id = None
        self._logs = None
        self._query = None
        self._coverage = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this DeploymentLogCollection.
        The model deployment the logs belong to.


        :return: The deployment_id of this DeploymentLogCollection.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this DeploymentLogCollection.
        The model deployment the logs belong to.


        :param deployment_id: The deployment_id of this DeploymentLogCollection.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def logs(self):
        """
        **[Required]** Gets the logs of this DeploymentLogCollection.

        :return: The logs of this DeploymentLogCollection.
        :rtype: oci.aidataplatform_dp.models.DeploymentLogPage
        """
        return self._logs

    @logs.setter
    def logs(self, logs):
        """
        Sets the logs of this DeploymentLogCollection.

        :param logs: The logs of this DeploymentLogCollection.
        :type: oci.aidataplatform_dp.models.DeploymentLogPage
        """
        self._logs = logs

    @property
    def query(self):
        """
        **[Required]** Gets the query of this DeploymentLogCollection.

        :return: The query of this DeploymentLogCollection.
        :rtype: oci.aidataplatform_dp.models.DeploymentLogQueryEcho
        """
        return self._query

    @query.setter
    def query(self, query):
        """
        Sets the query of this DeploymentLogCollection.

        :param query: The query of this DeploymentLogCollection.
        :type: oci.aidataplatform_dp.models.DeploymentLogQueryEcho
        """
        self._query = query

    @property
    def coverage(self):
        """
        **[Required]** Gets the coverage of this DeploymentLogCollection.

        :return: The coverage of this DeploymentLogCollection.
        :rtype: oci.aidataplatform_dp.models.DeploymentLogCoverage
        """
        return self._coverage

    @coverage.setter
    def coverage(self, coverage):
        """
        Sets the coverage of this DeploymentLogCollection.

        :param coverage: The coverage of this DeploymentLogCollection.
        :type: oci.aidataplatform_dp.models.DeploymentLogCoverage
        """
        self._coverage = coverage

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
