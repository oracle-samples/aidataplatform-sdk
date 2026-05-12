# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MetricsSummary(object):
    """
    A summarized metric result containing aggregated data points.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new MetricsSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param namespace:
            The value to assign to the namespace property of this MetricsSummary.
        :type namespace: str

        :param compartment_id:
            The value to assign to the compartment_id property of this MetricsSummary.
        :type compartment_id: str

        :param name:
            The value to assign to the name property of this MetricsSummary.
        :type name: str

        :param dimensions:
            The value to assign to the dimensions property of this MetricsSummary.
        :type dimensions: object

        :param metadata:
            The value to assign to the metadata property of this MetricsSummary.
        :type metadata: object

        :param resolution:
            The value to assign to the resolution property of this MetricsSummary.
        :type resolution: str

        :param resource_group:
            The value to assign to the resource_group property of this MetricsSummary.
        :type resource_group: str

        :param aggregated_data_points:
            The value to assign to the aggregated_data_points property of this MetricsSummary.
        :type aggregated_data_points: list[oci.aidataplatform_dp.models.AggregatedDataPoint]

        """
        self.swagger_types = {
            'namespace': 'str',
            'compartment_id': 'str',
            'name': 'str',
            'dimensions': 'object',
            'metadata': 'object',
            'resolution': 'str',
            'resource_group': 'str',
            'aggregated_data_points': 'list[AggregatedDataPoint]'
        }

        self.attribute_map = {
            'namespace': 'namespace',
            'compartment_id': 'compartmentId',
            'name': 'name',
            'dimensions': 'dimensions',
            'metadata': 'metadata',
            'resolution': 'resolution',
            'resource_group': 'resourceGroup',
            'aggregated_data_points': 'aggregatedDataPoints'
        }

        self._namespace = None
        self._compartment_id = None
        self._name = None
        self._dimensions = None
        self._metadata = None
        self._resolution = None
        self._resource_group = None
        self._aggregated_data_points = None

    @property
    def namespace(self):
        """
        **[Required]** Gets the namespace of this MetricsSummary.
        The source service or application that emitted the metric.


        :return: The namespace of this MetricsSummary.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this MetricsSummary.
        The source service or application that emitted the metric.


        :param namespace: The namespace of this MetricsSummary.
        :type: str
        """
        self._namespace = namespace

    @property
    def compartment_id(self):
        """
        **[Required]** Gets the compartment_id of this MetricsSummary.
        The OCID of the compartment containing the resources that the aggregated data was returned from.


        :return: The compartment_id of this MetricsSummary.
        :rtype: str
        """
        return self._compartment_id

    @compartment_id.setter
    def compartment_id(self, compartment_id):
        """
        Sets the compartment_id of this MetricsSummary.
        The OCID of the compartment containing the resources that the aggregated data was returned from.


        :param compartment_id: The compartment_id of this MetricsSummary.
        :type: str
        """
        self._compartment_id = compartment_id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this MetricsSummary.
        The name of the metric.


        :return: The name of this MetricsSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this MetricsSummary.
        The name of the metric.


        :param name: The name of this MetricsSummary.
        :type: str
        """
        self._name = name

    @property
    def dimensions(self):
        """
        **[Required]** Gets the dimensions of this MetricsSummary.
        Key-value pairs that provide context for the metric.


        :return: The dimensions of this MetricsSummary.
        :rtype: object
        """
        return self._dimensions

    @dimensions.setter
    def dimensions(self, dimensions):
        """
        Sets the dimensions of this MetricsSummary.
        Key-value pairs that provide context for the metric.


        :param dimensions: The dimensions of this MetricsSummary.
        :type: object
        """
        self._dimensions = dimensions

    @property
    def metadata(self):
        """
        Gets the metadata of this MetricsSummary.
        Additional references provided in the metric definition.


        :return: The metadata of this MetricsSummary.
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """
        Sets the metadata of this MetricsSummary.
        Additional references provided in the metric definition.


        :param metadata: The metadata of this MetricsSummary.
        :type: object
        """
        self._metadata = metadata

    @property
    def resolution(self):
        """
        Gets the resolution of this MetricsSummary.
        The time between calculated aggregation windows.


        :return: The resolution of this MetricsSummary.
        :rtype: str
        """
        return self._resolution

    @resolution.setter
    def resolution(self, resolution):
        """
        Sets the resolution of this MetricsSummary.
        The time between calculated aggregation windows.


        :param resolution: The resolution of this MetricsSummary.
        :type: str
        """
        self._resolution = resolution

    @property
    def resource_group(self):
        """
        Gets the resource_group of this MetricsSummary.
        A custom string used for grouping related metrics.


        :return: The resource_group of this MetricsSummary.
        :rtype: str
        """
        return self._resource_group

    @resource_group.setter
    def resource_group(self, resource_group):
        """
        Sets the resource_group of this MetricsSummary.
        A custom string used for grouping related metrics.


        :param resource_group: The resource_group of this MetricsSummary.
        :type: str
        """
        self._resource_group = resource_group

    @property
    def aggregated_data_points(self):
        """
        **[Required]** Gets the aggregated_data_points of this MetricsSummary.
        List of timestamp-value pairs for the metric.


        :return: The aggregated_data_points of this MetricsSummary.
        :rtype: list[oci.aidataplatform_dp.models.AggregatedDataPoint]
        """
        return self._aggregated_data_points

    @aggregated_data_points.setter
    def aggregated_data_points(self, aggregated_data_points):
        """
        Sets the aggregated_data_points of this MetricsSummary.
        List of timestamp-value pairs for the metric.


        :param aggregated_data_points: The aggregated_data_points of this MetricsSummary.
        :type: list[oci.aidataplatform_dp.models.AggregatedDataPoint]
        """
        self._aggregated_data_points = aggregated_data_points

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
